package com.bartendersbible.repositories;

import com.bartendersbible.entities.Favoris;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavorisRepository extends JpaRepository<Favoris, String> {

}
