package com.example.ecommerce.ecommerce.dto;

import com.example.ecommerce.ecommerce.entity.Category;
import lombok.*;

@Builder
@AllArgsConstructor
@Getter
@NoArgsConstructor
@Setter
@ToString
public class FakeStoreProductResponseDTO {
    private Long id;
    private String title;
    private Double price;
    private String description;
    private Long categoryId;
    private String image;

}
