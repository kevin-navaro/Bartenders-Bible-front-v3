package com.bartendersbible.bartendersbiblefinal.controller;

import com.bartendersbible.bartendersbiblefinal.entities.Recipe;
import com.bartendersbible.bartendersbiblefinal.entities.User;
import com.bartendersbible.bartendersbiblefinal.repositories.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/recipes")
public class RecipeController {

    @Autowired
    private RecipeRepository recipeRepository;

    @GetMapping("/")
    public List<Recipe> retrieveAllRecipes(){
        return recipeRepository.findAll();
    }

    @GetMapping("/{id}")
    public Recipe retrieveUser(@PathVariable long id) {
        Optional<Recipe> recipe = recipeRepository.findById(id);

        if(recipe.isEmpty())
            try {
                throw new UserPrincipalNotFoundException("id-" + id);
            } catch (UserPrincipalNotFoundException e) {
                throw new RuntimeException(e);
            }

        return recipe.get();

    }

    @DeleteMapping("/{id}")
    public void deleteRecipe(@PathVariable long id){
        recipeRepository.deleteById(id);
    }

    @PostMapping("/")
    public ResponseEntity<Object> createRecipe(@RequestBody Recipe recipe) {
        User savedUser = recipeRepository.save(recipe).getUser();

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(savedUser.getId()).toUri();

        return ResponseEntity.created(location).build();

    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateStudent(@RequestBody Recipe recipe, @PathVariable long id) {

        Optional<Recipe> userOptional = recipeRepository.findById(id);

        if (userOptional.isEmpty())
            return ResponseEntity.notFound().build();

        recipe.setId(id);

        recipeRepository.save(recipe);

        return ResponseEntity.noContent().build();
    }
}
