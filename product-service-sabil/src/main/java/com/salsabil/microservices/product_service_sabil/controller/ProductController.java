package com.salsabil.microservices.product_service_sabil.controller;

import com.salsabil.microservices.product_service_sabil.dto.ProductRequest;
import com.salsabil.microservices.product_service_sabil.dto.ProductResponse;
// import com.salsabil.microservices.product_service_sabil.model.Product;
import com.salsabil.microservices.product_service_sabil.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;
    
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProductResponse createProduct(@RequestBody ProductRequest productRequest) {
        return productService.createProduct(productRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getAllProducts() {
        return productService.getAllProducts();
    }
}
