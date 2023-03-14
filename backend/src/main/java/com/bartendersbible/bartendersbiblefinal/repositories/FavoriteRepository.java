package com.bartendersbible.bartendersbiblefinal.repositories;

import com.bartendersbible.bartendersbiblefinal.entities.Favorite;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface FavoriteRepository extends JpaRepository<Favorite, Long> {


}
