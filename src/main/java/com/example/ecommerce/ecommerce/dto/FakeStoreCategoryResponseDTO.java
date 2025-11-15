package com.example.ecommerce.ecommerce.dto;

import lombok.*;

import java.util.List;

@Builder
@AllArgsConstructor
@Getter
@NoArgsConstructor
@Setter
public class FakeStoreCategoryResponseDTO {
    private String status;
    private String message;
    private List<String> categories;


}
