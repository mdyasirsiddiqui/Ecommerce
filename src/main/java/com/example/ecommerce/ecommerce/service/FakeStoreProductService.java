package com.example.ecommerce.ecommerce.service;

import com.example.ecommerce.ecommerce.Gateway.IProductGateway;
import com.example.ecommerce.ecommerce.Mapper.FakeStoreResponseToDtoMapper;
import com.example.ecommerce.ecommerce.dto.FakeStoreProductResponseDTO;
import com.example.ecommerce.ecommerce.dto.ProductFakeStoreDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class FakeStoreProductService implements IProductService{

private FakeStoreResponseToDtoMapper fakeStoreResponseToDtoMapper;
    private IProductGateway iProductGateway;
    public FakeStoreProductService(IProductGateway iProductGateway, FakeStoreResponseToDtoMapper fakeStoreResponseToDtoMapper)
    {
        this.iProductGateway=iProductGateway;
        this.fakeStoreResponseToDtoMapper = fakeStoreResponseToDtoMapper;
    }
    @Override
    public List<FakeStoreProductResponseDTO> getAllProduct() {
        log.info("in ProductService class");
        return iProductGateway.getALLProducts();
    }

    @Override
    public FakeStoreProductResponseDTO getProductById(Long id) {
//        ProductFakeStoreDTO prodDTO= fakeStoreResponseToDtoMapper.mapToDto((iProductGateway.getProductById(id)));
//        if(prodDTO==null)return null;
//        return prodDTO;
        return null;
    }

    @Override
    public FakeStoreProductResponseDTO addProduct(FakeStoreProductResponseDTO fakeStoreProductResponseDTO) {
        return null;
    }
}
