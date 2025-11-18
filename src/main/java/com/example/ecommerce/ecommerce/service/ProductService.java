package com.example.ecommerce.ecommerce.service;

import com.example.ecommerce.ecommerce.Gateway.IProductGateway;
import com.example.ecommerce.ecommerce.dto.FakeStoreProductResponseDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ProductService implements IProductService{

    private IProductGateway iProductGateway;
    public ProductService(IProductGateway iProductGateway)
    {
        this.iProductGateway=iProductGateway;
    }
    @Override
    public List<FakeStoreProductResponseDTO> getAllProduct() {
        log.info("in ProductService class");
        return iProductGateway.getALLProducts();
    }
}
