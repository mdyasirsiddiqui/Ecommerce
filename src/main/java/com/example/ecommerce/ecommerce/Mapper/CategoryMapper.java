package com.example.ecommerce.ecommerce.Mapper;

import com.example.ecommerce.ecommerce.dto.AllProductsOfCategoryDTO;
import com.example.ecommerce.ecommerce.dto.FakeStoreCategoryDTO;
import com.example.ecommerce.ecommerce.entity.Category;
import com.example.ecommerce.ecommerce.entity.Product;

public class CategoryMapper {

    public static FakeStoreCategoryDTO toDto(Category category)
    {
        return FakeStoreCategoryDTO.builder()
                .name(category.getName())
                .id(category.getId())
                .build();
    }

    public static Category toEntity(FakeStoreCategoryDTO fakeStoreCategoryDTO)
    {
        return Category.builder()
                .name(fakeStoreCategoryDTO.getName())
                //.id(fakeStoreCategoryDTO.getId())
                .build();
    }
}
