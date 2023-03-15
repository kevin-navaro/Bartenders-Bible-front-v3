package com.bartendersbible.repositories;

import com.bartendersbible.entities.Ingredients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.relational.core.sql.In;

import java.util.List;
import java.util.Optional;

public interface IngredientsRepository extends JpaRepository <Ingredients, Long> {

    @Query("SELECT i FROM Ingredients i ORDER BY i.name")
    List<Ingredients> getASomeIngredients();

}
