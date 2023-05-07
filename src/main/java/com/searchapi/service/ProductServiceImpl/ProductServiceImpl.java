package com.searchapi.service.ProductServiceImpl;

import com.searchapi.entity.Product;
import com.searchapi.repository.ProductRepository;
import com.searchapi.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl  implements ProductService {
    private  ProductRepository  productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> searchProducts(String query) {
       List<Product> products = productRepository.searchProduct(query);
        return products;
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }
}
