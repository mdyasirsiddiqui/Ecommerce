package com.example.ecommerce.ecommerce.dto;

import com.example.ecommerce.ecommerce.entity.Product;
import lombok.*;

import java.util.List;

@Builder
@AllArgsConstructor
@Getter
@NoArgsConstructor
@Setter
@ToString
public class AllProductsOfCategoryDTO {
    private String name;
    private Long categoryId;
    private List<FakeStoreProductResponseDTO> list;

}
