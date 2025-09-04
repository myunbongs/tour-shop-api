package com.myunbongs.tourshop.domain.repository;

import com.myunbongs.tourshop.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByUsername(String username);
}
