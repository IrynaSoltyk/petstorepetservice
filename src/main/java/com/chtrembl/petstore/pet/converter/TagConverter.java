package com.chtrembl.petstore.pet.converter;

import java.util.ArrayList;
import java.util.List;

import com.chtrembl.petstore.pet.entity.Tag;

public class TagConverter {

    public static List<com.chtrembl.petstore.pet.model.Tag> convertAll(List<Tag> tags) {
        List<com.chtrembl.petstore.pet.model.Tag> tagModels = new ArrayList<>(tags.size());
        for (Tag tag : tags) {
            tagModels.add(convert(tag));
        }

        return tagModels;
    }

    public static com.chtrembl.petstore.pet.model.Tag convert(Tag tag) {
        com.chtrembl.petstore.pet.model.Tag tagModel = new com.chtrembl.petstore.pet.model.Tag();
        tagModel.setId(tag.getId());
        tagModel.setName(tag.getName());

        return tagModel;
    }
}
