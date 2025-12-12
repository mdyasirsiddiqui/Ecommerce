package com.example.ecommerce.ecommerce.service;

import com.example.ecommerce.ecommerce.Gateway.ICategoryGateway;
import com.example.ecommerce.ecommerce.dto.AllProductsOfCategoryDTO;
import com.example.ecommerce.ecommerce.dto.FakeStoreCategoryDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
@Slf4j
@Service
public class FakeStoreCategoryService implements ICategoryService{

    private ICategoryGateway iCategoryGateway;

    @Override
    public FakeStoreCategoryDTO saveCategory(FakeStoreCategoryDTO fakeStoreCategoryDTO) {
        return null;
    }

    @Override
    public AllProductsOfCategoryDTO getAllProductsForCategory(Long categoryId) throws Exception{
        return null;
    }

    FakeStoreCategoryService(@Qualifier("thisOneIsRestTemplate") ICategoryGateway iCategoryGateway)
    {
        this.iCategoryGateway=iCategoryGateway;
    }

    @Override
    public List<String> getAllCategories() throws IOException {
        log.info("in CategoryService class");
        return iCategoryGateway.getAllCategories();
    }

}
