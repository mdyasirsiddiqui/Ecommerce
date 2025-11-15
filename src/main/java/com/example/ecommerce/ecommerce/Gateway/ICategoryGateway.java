package com.example.ecommerce.ecommerce.Gateway;

import com.example.ecommerce.ecommerce.dto.CategoryDTO;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public interface ICategoryGateway {

    public List<String> getAllCategories() throws IOException;
}

