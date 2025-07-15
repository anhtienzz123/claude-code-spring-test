package com.example.demo;

import org.springframework.web.bind.annotation.*;
import java.math.BigDecimal;
import java.util.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    private static final List<Product> productList = Arrays.asList(
        new Product(1L, "Laptop", new BigDecimal("999.99"), 10),
        new Product(2L, "Mouse", new BigDecimal("29.99"), 50),
        new Product(3L, "Keyboard", new BigDecimal("79.99"), 25),
        new Product(4L, "Monitor", new BigDecimal("299.99"), 15),
        new Product(5L, "Headphones", new BigDecimal("149.99"), 30)
    );

    @GetMapping
    public List<Product> getProductList() {
        return productList;
    }
}