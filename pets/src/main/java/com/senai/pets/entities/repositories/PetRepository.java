package com.senai.pets.entities.repositories;
import org.springframework.data.repository.CrudRepository;
import com.senai.pets.entities.Pet;

public interface PetRepository extends CrudRepository <Pet, Long> {
    
}
