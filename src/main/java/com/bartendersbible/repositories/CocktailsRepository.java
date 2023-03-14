package com.bartendersbible.repositories;

import com.bartendersbible.entities.Cocktails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CocktailsRepository extends JpaRepository <Cocktails, String> {

}
