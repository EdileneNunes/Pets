package com.senai.pets.entities.repositories;

import org.springframework.data.repository.CrudRepository;

import com.senai.pets.entities.User;

public interface UserRepository extends CrudRepository<User, Long>{
    
}
