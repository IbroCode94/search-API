package com.searchapi.service;

import com.searchapi.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> searchProducts(String  query);
    Product createProduct(Product product);
}
