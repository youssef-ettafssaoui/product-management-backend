package com.youssef.serverproductmanagement.repository;

import com.youssef.serverproductmanagement.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Users, Long> {
    // Creation of my first query : findBy + Username
    Optional<Users> findByUsername(String username);
}
