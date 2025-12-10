package com.example.ecommerce.ecommerce.dto;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

@NoArgsConstructor@Builder@Getter@Setter@AllArgsConstructor@Slf4j
public class ProductWithCategoryDTO {
    private Long id;
    private String title;
    private Double price;
    private String description;
    private String image;
    private FakeStoreCategoryDTO categoryDTO;

}
