package com.bartendersbible.services;

import com.bartendersbible.entities.Ingredients;
import com.bartendersbible.repositories.IngredientsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientService {

    private final IngredientsRepository ingredientsRepository;

    @Autowired
    public IngredientService(IngredientsRepository ingredientsRepository) {
        this.ingredientsRepository = ingredientsRepository;
    }

    public List<Ingredients> getSomeIngredients() {
        return this.ingredientsRepository.getASomeIngredients();
    }
}
