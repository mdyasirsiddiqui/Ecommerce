package com.example.ecommerce.ecommerce.entity;

import jakarta.persistence.Entity;

@Entity
public class Product extends BaseEntity {

    public String title;
    public double price;
    public String description;
    public String category;
    public String image;
}
