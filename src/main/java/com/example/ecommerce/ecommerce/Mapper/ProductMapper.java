package com.example.ecommerce.ecommerce.Mapper;

import com.example.ecommerce.ecommerce.dto.FakeStoreProductResponseDTO;
import com.example.ecommerce.ecommerce.dto.ProductWithCategoryDTO;
import com.example.ecommerce.ecommerce.entity.Category;
import com.example.ecommerce.ecommerce.entity.Product;
import org.springframework.stereotype.Component;


public class ProductMapper {
    public static  FakeStoreProductResponseDTO toDto(Product product)
    {
       return FakeStoreProductResponseDTO.builder()
               .id(product.getId())
               .title(product.getTitle())
               .price(product.getPrice())
               .description(product.getDescription())
               .categoryId(product.getCategory().getId())
               .image(product.getImage())
               .build();
    }

    public static Product toEntity(FakeStoreProductResponseDTO fakeStoreProductResponseDTO, Category category)
    {
        return Product.builder()
                //.id(fakeStoreProductResponseDTO.getId())
                .title(fakeStoreProductResponseDTO.getTitle())
                .price(fakeStoreProductResponseDTO.getPrice())
                .description(fakeStoreProductResponseDTO.getDescription())
                .category(category)
                .image(fakeStoreProductResponseDTO.getImage())
                .build();
    }

    public static ProductWithCategoryDTO toProductWithCategory(Product product)
    {
        return ProductWithCategoryDTO.builder()
                .id(product.getId())
                .title(product.getTitle())
                .price(product.getPrice())
                .description(product.getDescription())
                .categoryDTO(CategoryMapper.toDto(product.getCategory()))
                .image(product.getImage())
                .build();
    }
}
