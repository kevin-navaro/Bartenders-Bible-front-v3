package com.bartendersbible.repositories;

import com.bartendersbible.entities.Recettes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecettesRepository extends JpaRepository<Recettes, String> {

}
