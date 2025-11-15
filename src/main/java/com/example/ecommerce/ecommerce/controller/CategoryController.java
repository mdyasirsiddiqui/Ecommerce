package com.example.ecommerce.ecommerce.controller;

import com.example.ecommerce.ecommerce.dto.CategoryDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.ecommerce.ecommerce.service.ICategoryService;

import java.io.IOException;
import java.util.List;
@Slf4j
@RestController
@RequestMapping("/categories")
public class CategoryController {

    private ICategoryService iCategoryService;
    public CategoryController(ICategoryService _CategoryService) // _ means constructor wala
    {
        this.iCategoryService=_CategoryService;
    }
    @GetMapping
    public List<String> getAllCategories() throws IOException {
        log.info("in CategoryController class");
        return iCategoryService.getAllCategories();
    }
}
