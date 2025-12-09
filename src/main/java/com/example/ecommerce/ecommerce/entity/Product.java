package com.example.ecommerce.ecommerce.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Entity@Builder@NoArgsConstructor@AllArgsConstructor@Getter@Setter
public class Product extends BaseEntity {
    private String title;
    private Double price;
    private String description;

    private String image;
    @ManyToOne
    @JoinColumn(name="category_id", nullable = false)
    private Category category;
}
