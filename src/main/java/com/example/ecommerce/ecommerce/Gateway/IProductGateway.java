package com.example.ecommerce.ecommerce.Gateway;

import com.example.ecommerce.ecommerce.dto.FakeStoreProductResponseDTO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface IProductGateway {
    public List<FakeStoreProductResponseDTO> getALLProducts();
    public FakeStoreProductResponseDTO getProductById(String id);
}
