package com.senai.pets.entities.repositories;

import org.springframework.data.repository.CrudRepository;

import com.senai.pets.entities.Tag;

public interface CategoryRepository extends CrudRepository<Tag, Long> {
    
}
