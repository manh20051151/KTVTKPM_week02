package com.example.product.contronller;

import com.example.product.entity.Product;
import com.example.product.repostirory.ProductRepostirory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/serviceProduct")

public class ProductContronller {
    @Autowired
    private ProductRepostirory productRepostirory;

    @GetMapping("/products")
    public List<Product> getAll(){
        List<Product> l = productRepostirory.findAll();

        return l;
    }
    @GetMapping("/products/{id}")
    public Optional<Product> getUserById(@PathVariable("id") int id) {
        Optional<Product> u = productRepostirory.findById(id);
        return u;
    }
}
