package com.restapi.service;

import com.restapi.model.Product;
import com.restapi.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    // Create new product
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    //Read All
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    //Read product by ID
    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }

    //update product
    public Product updateProduct(Long id, Product updateProductDetails) {
        Product product = productRepository.findById(id).orElseThrow(() -> new RuntimeException("product not found with id " + id));
        product.setName(updateProductDetails.getName());
        product.setPrice(updateProductDetails.getPrice());
        return productRepository.save(product);
    }

    // delete a product by id
    public void deleteProduct(Long id) {
        Product product = productRepository.findById(id).orElseThrow(() -> new RuntimeException("product not found with id " + id));
        productRepository.delete(product);
    }
}
