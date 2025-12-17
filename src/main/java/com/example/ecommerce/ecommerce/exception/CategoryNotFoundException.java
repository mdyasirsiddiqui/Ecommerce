package com.example.ecommerce.ecommerce.exception;

public class CategoryNotFoundException extends RuntimeException {
    public CategoryNotFoundException(String message) {

        super(message);
    }
}
