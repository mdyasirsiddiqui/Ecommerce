package com.example.ecommerce.ecommerce.entity;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter@Setter@NoArgsConstructor@AllArgsConstructor@Builder
public class Category extends BaseEntity {

    @Column(nullable = false, unique = true)
    private String name;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Product> productList;
}
