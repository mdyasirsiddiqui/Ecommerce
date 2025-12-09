package com.example.ecommerce.ecommerce.Mapper;

import com.example.ecommerce.ecommerce.dto.FakeStoreProductResponseDTO;
import com.example.ecommerce.ecommerce.dto.ProductFakeStoreDTO;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FakeStoreResponseToDtoMapper {
    public ProductFakeStoreDTO mapToDto(FakeStoreProductResponseDTO fakeStoreProductResponseDTO){
        if(fakeStoreProductResponseDTO==null)return null;
        return ProductFakeStoreDTO.builder()
                .title(fakeStoreProductResponseDTO.getTitle())
                .build();
    }

}
