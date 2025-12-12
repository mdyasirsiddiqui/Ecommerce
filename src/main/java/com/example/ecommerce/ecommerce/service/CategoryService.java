package com.example.ecommerce.ecommerce.service;

import com.example.ecommerce.ecommerce.Mapper.CategoryMapper;
import com.example.ecommerce.ecommerce.Mapper.ProductMapper;
import com.example.ecommerce.ecommerce.dto.AllProductsOfCategoryDTO;
import com.example.ecommerce.ecommerce.dto.FakeStoreCategoryDTO;
import com.example.ecommerce.ecommerce.dto.FakeStoreProductResponseDTO;
import com.example.ecommerce.ecommerce.entity.Category;
import com.example.ecommerce.ecommerce.repository.CategoryRepository;
import com.example.ecommerce.ecommerce.repository.ProductRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Primary
public class CategoryService implements ICategoryService{

    private CategoryRepository categoryRepository;
    private ProductRepository productRepository;
    public CategoryService(CategoryRepository categoryRepository,ProductRepository productRepository)
    {
        this.categoryRepository=categoryRepository;
        this.productRepository=productRepository;
    }
    @Override
    public List<String> getAllCategories() throws IOException {
        return List.of();
    }

    @Override
    public FakeStoreCategoryDTO saveCategory(FakeStoreCategoryDTO fakeStoreCategoryDTO) {
        Category saved= (Category) categoryRepository.save(CategoryMapper.toEntity(fakeStoreCategoryDTO));
        return CategoryMapper.toDto(saved);
    }

    @Override
    public AllProductsOfCategoryDTO getAllProductsForCategory(Long categoryId) throws Exception {
        Category category = categoryRepository.findById(categoryId)
                .orElseThrow(() -> new Exception("Category not found with id: " + categoryId));
        List<FakeStoreProductResponseDTO> productsDTO=category.getProductList()
                .stream()
                .map(product->ProductMapper.toDto(product))
                .collect(Collectors.toList());

        return  AllProductsOfCategoryDTO.builder()
                .categoryId(category.getId())
                .name(category.getName())
                .list(productsDTO)
                .build();
    }
}
