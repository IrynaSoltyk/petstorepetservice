package com.chtrembl.petstore.pet.repository;

import java.util.List;


import com.chtrembl.petstore.pet.entity.Pet;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepository extends JpaRepository<Pet, Long> {

    List<Pet> findByStatus(String status);
}
