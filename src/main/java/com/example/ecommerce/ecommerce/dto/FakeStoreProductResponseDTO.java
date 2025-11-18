package com.example.ecommerce.ecommerce.dto;

import lombok.*;

@Builder
@AllArgsConstructor
@Getter
@NoArgsConstructor
@Setter
public class FakeStoreProductResponseDTO {
    private Integer id;
    private String title;
    private Double price;
    private String description;
    private String category;
    private String image;

}
