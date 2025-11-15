package com.example.ecommerce.ecommerce.service;

import com.example.ecommerce.ecommerce.Gateway.ICategoryGateway;
import com.example.ecommerce.ecommerce.dto.CategoryDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
@Slf4j
@Service
public class CategoryService implements ICategoryService{
    private ICategoryGateway iCategoryGateway;
    CategoryService(ICategoryGateway iCategoryGateway)
    {
        this.iCategoryGateway=iCategoryGateway;
    }

    @Override
    public List<String> getAllCategories() throws IOException {
        log.info("in CategoryService class");
        return iCategoryGateway.getAllCategories();
    }
}
