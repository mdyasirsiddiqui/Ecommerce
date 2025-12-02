package com.example.ecommerce.ecommerce.Mapper;

import com.example.ecommerce.ecommerce.dto.FakeStoreProductResponseDTO;
import com.example.ecommerce.ecommerce.dto.ProductDTO;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ResponseToDtoMapper {
    public ProductDTO mapToDto(FakeStoreProductResponseDTO fakeStoreProductResponseDTO){
        if(fakeStoreProductResponseDTO==null)return null;
        return ProductDTO.builder()
                .title(fakeStoreProductResponseDTO.getTitle())
                .build();
    }

}
