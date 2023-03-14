package com.bartendersbible.bartendersbiblefinal.repositories;

import com.bartendersbible.bartendersbiblefinal.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
}
