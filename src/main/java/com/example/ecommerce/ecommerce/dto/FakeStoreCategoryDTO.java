package com.example.ecommerce.ecommerce.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
@Builder
@Getter
@Setter
public class FakeStoreCategoryDTO {
    private  String name;
    private Long id;

}
