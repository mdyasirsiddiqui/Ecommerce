package com.example.ecommerce.ecommerce.controller;

import com.example.ecommerce.ecommerce.dto.FakeStoreProductResponseDTO;
import com.example.ecommerce.ecommerce.dto.ProductFakeStoreDTO;
import com.example.ecommerce.ecommerce.dto.ProductWithCategoryDTO;
import com.example.ecommerce.ecommerce.service.FakeStoreProductService;
import com.example.ecommerce.ecommerce.service.ICategoryService;
import com.example.ecommerce.ecommerce.service.IProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{id}")
    public ResponseEntity<FakeStoreProductResponseDTO> getProductById(@PathVariable Long id)
    {
        return ResponseEntity.ok(iProductService.getProductById(id));
    }

    @PostMapping()
    public ResponseEntity<FakeStoreProductResponseDTO> addProduct(@RequestBody FakeStoreProductResponseDTO dto)
    {
        return ResponseEntity.ok(iProductService.addProduct(dto));
    }

    @GetMapping("/{id}/details")
    public  ResponseEntity<ProductWithCategoryDTO> getProductWithCategory(@PathVariable Long id)
    {
        return ResponseEntity.ok(iProductService.getProductWithCategory(id));
    }

}
