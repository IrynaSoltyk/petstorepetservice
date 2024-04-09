package com.chtrembl.petstore.pet.converter;

import java.util.ArrayList;
import java.util.List;

import com.chtrembl.petstore.pet.entity.Pet;

public class PetConverter {

    public static List<com.chtrembl.petstore.pet.model.Pet> convertAll(List<Pet> pets) {
        List<com.chtrembl.petstore.pet.model.Pet> petModels = new ArrayList<>(pets.size());
        for (Pet pet : pets) {
            petModels.add(convert(pet));
        }

        return petModels;
    }

    public static com.chtrembl.petstore.pet.model.Pet convert(Pet pet) {
        com.chtrembl.petstore.pet.model.Pet petModel = new com.chtrembl.petstore.pet.model.Pet();
        petModel.setId(pet.getId());
        petModel.setName(pet.getName());
        petModel.setPhotoURL(pet.getPhotoURL());
        petModel.setCategory(CategoryConverter.convert(pet.getCategory()));
        petModel.setTags(TagConverter.convertAll(pet.getTags()));
        petModel.setStatus(com.chtrembl.petstore.pet.model.Pet.StatusEnum.fromValue(pet.getStatus()));

        return petModel;
    }
}
