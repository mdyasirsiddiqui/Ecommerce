package com.example.ecommerce.ecommerce.service;

import com.example.ecommerce.ecommerce.dto.FakeStoreProductResponseDTO;
import com.example.ecommerce.ecommerce.dto.ProductFakeStoreDTO;
import org.springframework.stereotype.Component;

import java.util.List;


public interface IProductService {
    public List<FakeStoreProductResponseDTO> getAllProduct();
    public FakeStoreProductResponseDTO getProductById(Long id);
    public FakeStoreProductResponseDTO addProduct(FakeStoreProductResponseDTO fakeStoreProductResponseDTO);
}
