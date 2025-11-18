package com.example.ecommerce.ecommerce.controller;

import com.example.ecommerce.ecommerce.dto.FakeStoreProductResponseDTO;
import com.example.ecommerce.ecommerce.service.IProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/products")
public class ProductController{

    private final IProductService iProductService;
    public ProductController(IProductService iProductService) // _ means constructor wala
    {
        this.iProductService=iProductService;
    }

    @GetMapping()
    public List<FakeStoreProductResponseDTO> getAllProducts()
    {
        log.info("in ProductController class");
        return iProductService.getAllProduct();
    }

}
