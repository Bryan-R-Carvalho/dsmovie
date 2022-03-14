package com.projetinho.dsmovie.repositories;

import com.projetinho.dsmovie.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}