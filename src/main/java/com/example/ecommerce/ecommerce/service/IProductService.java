package com.example.ecommerce.ecommerce.service;

import com.example.ecommerce.ecommerce.dto.FakeStoreProductResponseDTO;
import com.example.ecommerce.ecommerce.dto.ProductDTO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface IProductService {
    public List<FakeStoreProductResponseDTO> getAllProduct();
    public ProductDTO getProductById(String id);
}
