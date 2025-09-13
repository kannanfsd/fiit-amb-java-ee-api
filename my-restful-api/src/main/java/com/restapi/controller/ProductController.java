package com.restapi.controller;

import com.restapi.model.Product;
import com.restapi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    // Create a new product
    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }

    // Get All products
    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    // Get a product by ID
    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable Long id) {
        Optional<Product> product = productService.getProductById(id);
        return product.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // update a product
    @PutMapping("/{id}")
    public ResponseEntity<Product> updateProductById(@PathVariable Long id, @RequestBody Product product) {
        try{
            Product updatedProduct = productService.updateProduct(id, product);
            return ResponseEntity.ok(updatedProduct);
        }catch (RuntimeException e){
            return ResponseEntity.notFound().build();
        }
    }

    // delete a product
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProductById(@PathVariable Long id) {
        try{
            productService.deleteProduct(id);
            return ResponseEntity.noContent().build();
        }catch (RuntimeException e){
            return ResponseEntity.notFound().build();
        }
    }

}
