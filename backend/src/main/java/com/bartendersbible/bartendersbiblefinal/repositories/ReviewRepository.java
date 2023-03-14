package com.bartendersbible.bartendersbiblefinal.repositories;

import com.bartendersbible.bartendersbiblefinal.entities.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
