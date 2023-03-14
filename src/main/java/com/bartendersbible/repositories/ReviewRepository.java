package com.bartendersbible.repositories;

import com.bartendersbible.entities.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review,String> {
}
