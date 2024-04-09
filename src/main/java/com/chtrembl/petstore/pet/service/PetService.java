package com.chtrembl.petstore.pet.service;

import java.util.List;

import com.chtrembl.petstore.pet.model.Pet;

public interface PetService {

    public List<Pet> getPetsByStatus(String status);

    public List<Pet> getPets();
}
