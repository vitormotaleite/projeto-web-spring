package com.vitor.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vitor.spring.entities.User;

public interface UserRepository extends JpaRepository<User,Long> {

    
    
}
