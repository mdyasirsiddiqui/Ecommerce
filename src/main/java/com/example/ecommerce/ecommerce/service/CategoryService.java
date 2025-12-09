package com.example.ecommerce.ecommerce.service;

import com.example.ecommerce.ecommerce.Mapper.CategoryMapper;
import com.example.ecommerce.ecommerce.dto.FakeStoreCategoryDTO;
import com.example.ecommerce.ecommerce.entity.Category;
import com.example.ecommerce.ecommerce.repository.CategoryRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
@Service
@Primary
public class CategoryService implements ICategoryService{

    private CategoryRepository categoryRepository;
    public CategoryService(CategoryRepository categoryRepository)
    {
        this.categoryRepository=categoryRepository;
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

}
