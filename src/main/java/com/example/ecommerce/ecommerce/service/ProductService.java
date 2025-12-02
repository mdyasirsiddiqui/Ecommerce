package com.example.ecommerce.ecommerce.service;

import com.example.ecommerce.ecommerce.Gateway.IProductGateway;
import com.example.ecommerce.ecommerce.Mapper.ResponseToDtoMapper;
import com.example.ecommerce.ecommerce.dto.FakeStoreProductResponseDTO;
import com.example.ecommerce.ecommerce.dto.ProductDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ProductService implements IProductService{

private ResponseToDtoMapper responseToDtoMapper;
    private IProductGateway iProductGateway;
    public ProductService(IProductGateway iProductGateway, ResponseToDtoMapper responseToDtoMapper)
    {
        this.iProductGateway=iProductGateway;
        this.responseToDtoMapper=responseToDtoMapper;
    }
    @Override
    public List<FakeStoreProductResponseDTO> getAllProduct() {
        log.info("in ProductService class");
        return iProductGateway.getALLProducts();
    }

    @Override
    public ProductDTO getProductById(String id) {
        ProductDTO prodDTO=responseToDtoMapper.mapToDto((iProductGateway.getProductById(id)));
        if(prodDTO==null)return null;
        return prodDTO;
    }
}
