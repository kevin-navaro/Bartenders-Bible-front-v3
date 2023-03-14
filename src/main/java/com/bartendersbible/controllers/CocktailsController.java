package com.bartendersbible.controllers;

import com.bartendersbible.repositories.CocktailsRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cocktails")
public class CocktailsController {

    CocktailsRepository cocktailsRepository;

    CocktailsController(CocktailsRepository cocktailsRepository) {
        this.cocktailsRepository = cocktailsRepository;
    }

}
