package com.example.product.repostirory;

import com.example.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepostirory extends JpaRepository<Product, Integer> {
}
