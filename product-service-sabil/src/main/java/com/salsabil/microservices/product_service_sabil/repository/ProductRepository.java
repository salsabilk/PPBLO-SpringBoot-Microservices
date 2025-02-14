package com.salsabil.microservices.product_service_sabil.repository;

import com.salsabil.microservices.product_service_sabil.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
    
}
