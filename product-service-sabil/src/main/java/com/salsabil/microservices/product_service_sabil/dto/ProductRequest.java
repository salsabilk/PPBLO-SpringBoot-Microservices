package com.salsabil.microservices.product_service_sabil.dto;

import java.math.BigDecimal;

public record ProductRequest(String id, String name, String description, BigDecimal price) {
    
}