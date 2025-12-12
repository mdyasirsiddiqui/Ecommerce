package com.example.ecommerce.ecommerce.controller;

import com.example.ecommerce.ecommerce.dto.AllProductsOfCategoryDTO;
import com.example.ecommerce.ecommerce.dto.FakeStoreCategoryDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.ecommerce.ecommerce.service.ICategoryService;

import java.io.IOException;
import java.util.List;
@Slf4j
@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private ObjectMapper objectMapper;

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
    @PostMapping
    public ResponseEntity<FakeStoreCategoryDTO> addCategory(@RequestBody FakeStoreCategoryDTO fakeStoreCategoryDTO)
    {
       // return iCategoryService.addCategory(fakeStoreCategoryDTO);
        try {
            log.info("in addController method {}", objectMapper.writeValueAsString(fakeStoreCategoryDTO));
        } catch (JsonProcessingException e)
        {
            log.error("error in serialisation",e);
        }
            return ResponseEntity.ok(iCategoryService.saveCategory(fakeStoreCategoryDTO));

    }
    @GetMapping("/{categoryId}")
    public ResponseEntity<AllProductsOfCategoryDTO> getAllProductOfCategory(@PathVariable Long categoryId) throws Exception {

        AllProductsOfCategoryDTO dto = iCategoryService.getAllProductsForCategory(categoryId);
        return ResponseEntity.ok(dto);


    }
}
