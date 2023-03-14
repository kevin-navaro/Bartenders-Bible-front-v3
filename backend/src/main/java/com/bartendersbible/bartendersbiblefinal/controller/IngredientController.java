package com.bartendersbible.bartendersbiblefinal.controller;

import com.bartendersbible.bartendersbiblefinal.entities.Ingredient;
import com.bartendersbible.bartendersbiblefinal.entities.User;
import com.bartendersbible.bartendersbiblefinal.repositories.IngredientRepository;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/ingredients")
public class IngredientController {

    @Autowired
    private IngredientRepository ingredientRepository;

    @GetMapping("/ingredients")
    public List<Ingredient> retrieveAllUsers(){
        return ingredientRepository.findAll();
    }

    @GetMapping("/ingredients/{id}")
    public Optional<Ingredient> retrieveIngredient(@PathVariable long id) {
        Optional<Ingredient> ingredient = ingredientRepository.findById(id);

        if(ingredient.isEmpty())
            try {
                throw new UserPrincipalNotFoundException("id-" + id);
            } catch (UserPrincipalNotFoundException e) {
                throw new RuntimeException(e);
            }

        return Optional.of(ingredient.get());

    }

    @DeleteMapping("/ingredients/{id}")
    public void deleteIngredient(@PathVariable long id){
        ingredientRepository.deleteById(id);
    }

    @PostMapping("/ingredients")
    public ResponseEntity<Object> createIngredient(@RequestBody Ingredient ingredient) {
        Ingredient savedIngredient = ingredientRepository.save(ingredient);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(savedIngredient.getId()).toUri();

        return ResponseEntity.created(location).build();

    }

    @PutMapping("/ingredients/{id}")
    public ResponseEntity<Object> updateStudent(@RequestBody Ingredient ingredient, @PathVariable long id) {

        Optional<Ingredient> ingredientOptional = ingredientRepository.findById(id);

        if (ingredientOptional.isEmpty())
            return ResponseEntity.notFound().build();

        ingredient.setId(id);

        ingredientRepository.save(ingredient);

        return ResponseEntity.noContent().build();
    }
}

