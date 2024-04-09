package com.chtrembl.petstore.pet.service;

import lombok.RequiredArgsConstructor;

import java.util.List;

import com.chtrembl.petstore.pet.converter.PetConverter;

import com.chtrembl.petstore.pet.model.Pet;
import com.chtrembl.petstore.pet.repository.PetRepository;

import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PetServiceImpl implements PetService {

    private final PetRepository petRepository;

    @Override
    public List<Pet> getPetsByStatus(String status) {
        List<com.chtrembl.petstore.pet.entity.Pet> pets = petRepository.findByStatus(status);

        return PetConverter.convertAll(pets);
    }

    @Override
    public List<Pet> getPets() {
        List<com.chtrembl.petstore.pet.entity.Pet> pets = petRepository.findAll();

        return PetConverter.convertAll(pets);
    }
}
