package com.bartendersbible.bartendersbiblefinal.controller;


import com.bartendersbible.bartendersbiblefinal.entities.Favorite;
import com.bartendersbible.bartendersbiblefinal.entities.User;
import com.bartendersbible.bartendersbiblefinal.repositories.FavoriteRepository;
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
@RequestMapping("/api/favorite")
public class FavoriteController {

    @Autowired
    private FavoriteRepository favoriteRepository;

    @GetMapping("/favorite")
    public List<Favorite> retrieveAllUsers(){
        return favoriteRepository.findAll();
    }

    @GetMapping("/favorite/{id}")
    public Optional<Favorite> retrieveFavorite(@PathVariable long id) {
        Optional<Favorite> favorite = favoriteRepository.findById(id);

        if(favorite.isEmpty())
            try {
                throw new UserPrincipalNotFoundException("id-" + id);
            } catch (UserPrincipalNotFoundException e) {
                throw new RuntimeException(e);
            }

        return Optional.of(favorite.get());

    }

    @DeleteMapping("/favorite/{id}")
    public void deleteFavorite(@PathVariable long id){
        favoriteRepository.deleteById(id);
    }

    @PostMapping("/favorite")
    public ResponseEntity<Object> createFavorite(@RequestBody Favorite favorite) {
        Favorite savedUser = favoriteRepository.save(favorite);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(savedUser.getId()).toUri();

        return ResponseEntity.created(location).build();

    }

    @PutMapping("/favorite/{id}")
    public ResponseEntity<Object> updateFavorite(@RequestBody Favorite favorite, @PathVariable long id) {

        Optional<Favorite> favoriteOptional = favoriteRepository.findById(id);

        if (favoriteOptional.isEmpty())
            return ResponseEntity.notFound().build();

        favorite.setId(id);

        favoriteRepository.save(favorite);

        return ResponseEntity.noContent().build();
    }
}

