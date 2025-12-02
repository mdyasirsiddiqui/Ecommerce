package com.example.ecommerce.ecommerce.service;
import com.example.ecommerce.ecommerce.dto.CategoryDTO;
import com.example.ecommerce.ecommerce.dto.FakeStoreProductResponseDTO;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;
@Component
public interface ICategoryService {

    public List<String> getAllCategories() throws IOException;
}