package com.bartendersbible.repositories;

import com.bartendersbible.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, String> {
}
