package com.example.ecommerce.ecommerce.service;

import com.example.ecommerce.ecommerce.Mapper.ProductMapper;
import com.example.ecommerce.ecommerce.dto.FakeStoreProductResponseDTO;
import com.example.ecommerce.ecommerce.dto.ProductWithCategoryDTO;
import com.example.ecommerce.ecommerce.entity.Category;
import com.example.ecommerce.ecommerce.entity.Product;
import com.example.ecommerce.ecommerce.repository.CategoryRepository;
import com.example.ecommerce.ecommerce.repository.ProductRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class ProductService implements IProductService {

    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;
    //private final ProductMapper productMapper;

    public ProductService(ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<FakeStoreProductResponseDTO> getAllProduct() {
        return productRepository.findAll()
                .stream()
                .map(ProductMapper::toDto)   // entity → DTO
                .toList();
    }

    @Override
    public FakeStoreProductResponseDTO getProductById(Long id) {
        return productRepository.findById(id)
                .map(ProductMapper::toDto)
                .orElseThrow(() -> new RuntimeException("Product id " + id + " not found"));
    }

    @Override
    public FakeStoreProductResponseDTO addProduct(FakeStoreProductResponseDTO dto) {
        Category categoryEntity = categoryRepository.findById(dto.getCategoryId())
                .orElseThrow(() -> new RuntimeException("Category not found"));

        // 2. Map DTO + Category entity → Product entity
        Product productEntity = ProductMapper.toEntity(dto, categoryEntity);

        // 3. Save product
        Product saved = productRepository.save(productEntity);

        // 4. Convert back to DTO for response
        return ProductMapper.toDto(saved);
    }

    @Override
    public ProductWithCategoryDTO getProductWithCategory(Long id) {
        return productRepository.findById(id)
                .map(ProductMapper::toProductWithCategory)
                .orElseThrow(()-> new RuntimeException("\"Product id \" + id + \" not found\""));
    }


}
