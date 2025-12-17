package com.example.ecommerce.ecommerce.service;

import com.example.ecommerce.ecommerce.Mapper.ProductMapper;
import com.example.ecommerce.ecommerce.dto.FakeStoreProductResponseDTO;
import com.example.ecommerce.ecommerce.dto.ProductWithCategoryDTO;
import com.example.ecommerce.ecommerce.entity.Category;
import com.example.ecommerce.ecommerce.entity.Product;
import com.example.ecommerce.ecommerce.exception.CategoryNotFoundException;
import com.example.ecommerce.ecommerce.exception.InvalidProductException;
import com.example.ecommerce.ecommerce.exception.ProductNotFoundException;
import com.example.ecommerce.ecommerce.repository.CategoryRepository;
import com.example.ecommerce.ecommerce.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Primary;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;
@Slf4j
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
        log.info("fetching all products");
        return productRepository.findAll()
                .stream()
                .map(ProductMapper::toDto)   // entity → DTO
                .toList();
    }

    @Override
    public FakeStoreProductResponseDTO getProductById(Long id) {
        log.info(" fetching product with id "+id);
        return productRepository.findById(id)
                .map(ProductMapper::toDto)
                .orElseThrow(() ->{
                    log.warn("Product id " + id + " not found");
                    return new ProductNotFoundException("Product not found with id: " + id);
                });
    }

    @Override
    public FakeStoreProductResponseDTO addProduct(FakeStoreProductResponseDTO dto) {
        log.info("adding products");
        if (dto.getTitle() == null && dto.getTitle().isBlank()) {
            throw new InvalidProductException("Product title is not valid");
        }
        Category categoryEntity = categoryRepository.findById(dto.getCategoryId())
                .orElseThrow(() -> new CategoryNotFoundException("Category not found"));

        // 2. Map DTO + Category entity → Product entity
        Product productEntity = ProductMapper.toEntity(dto, categoryEntity);

        // 3. Save product
        Product saved;
        try {
            saved = productRepository.save(productEntity);
        } catch (DataIntegrityViolationException exception) {
            throw new InvalidProductException("Duplicate Product", exception);
        }
//     ----OR----
//        Product saved = saveProductSafely(productEntity);
//        return ProductMapper.toDto(saved);

        // 4. Convert back to DTO for response
        return ProductMapper.toDto(saved);
    }
    private Product saveProductSafely(Product productEntity) {
        try {
            return productRepository.save(productEntity);
        } catch (DataIntegrityViolationException ex) {
            throw new InvalidProductException("Duplicate Product", ex);
        }
    }


    @Override
    public ProductWithCategoryDTO getProductWithCategory(Long id) {
        return productRepository.findById(id)
                .map(ProductMapper::toProductWithCategory)
                .orElseThrow(()-> new ProductNotFoundException("\"Product id \" + id + \" not found\""));
    }


}
