package com.chtrembl.petstore.pet.converter;

import com.chtrembl.petstore.pet.entity.Category;

public class CategoryConverter {

    public static com.chtrembl.petstore.pet.model.Category convert(Category category) {
        com.chtrembl.petstore.pet.model.Category categoryModel = new com.chtrembl.petstore.pet.model.Category();
        categoryModel.setId(category.getId());
        categoryModel.setName(category.getName());

        return categoryModel;
    }
}
