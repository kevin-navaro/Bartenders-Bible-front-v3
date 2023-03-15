package com.bartendersbible.controllers;

import com.bartendersbible.entities.Ingredients;
import com.bartendersbible.services.IngredientService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/ingredients")
public class IngredientsController {

    private final IngredientService ingredientService;

    public IngredientsController(IngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }

    @GetMapping
    public List<Ingredients> getIngredientsList() {
        return ingredientService.getSomeIngredients();
    }
}
