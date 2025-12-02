package com.example.ecommerce.ecommerce.service;

import com.example.ecommerce.ecommerce.Gateway.ICategoryGateway;
import com.example.ecommerce.ecommerce.Gateway.IProductGateway;
import com.example.ecommerce.ecommerce.dto.FakeStoreProductResponseDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
@Slf4j
@Service
public class CategoryService implements ICategoryService{

    private ICategoryGateway iCategoryGateway;
    CategoryService(@Qualifier("thisOneIsRestTemplate") ICategoryGateway iCategoryGateway)
    {
        this.iCategoryGateway=iCategoryGateway;
    }

    @Override
    public List<String> getAllCategories() throws IOException {
        log.info("in CategoryService class");
        return iCategoryGateway.getAllCategories();
    }

}
