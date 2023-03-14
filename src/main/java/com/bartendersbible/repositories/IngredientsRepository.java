package com.bartendersbible.repositories;

import com.bartendersbible.entities.Ingredients;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientsRepository extends JpaRepository <Ingredients, String> {
}
