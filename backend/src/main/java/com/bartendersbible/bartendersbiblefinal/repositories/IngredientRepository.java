package com.bartendersbible.bartendersbiblefinal.repositories;

import com.bartendersbible.bartendersbiblefinal.entities.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IngredientRepository extends JpaRepository<Ingredient, Long> {
}
