package com.salsabil.microservices.order.service;

import org.springframework.stereotype.Service;

import com.salsabil.microservices.order.dto.OrderRequest;
import com.salsabil.microservices.order.model.Order;
import com.salsabil.microservices.order.repository.OrderRepository;
import com.salsabil.microservices.order.client.InventoryClient;
import java.util.UUID;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;
    private final InventoryClient inventoryClient; // Perbaiki typo di sini

    public void placeOrder(OrderRequest orderRequest) {

        var isProductInStock = inventoryClient.isInStock(orderRequest.skuCode(), orderRequest.quantity());

        if (isProductInStock) {
            Order order = new Order();
            order.setOrderNumber(UUID.randomUUID().toString());
            order.setPrice(orderRequest.price());
            order.setSkuCode(orderRequest.skuCode());
            order.setQuantity(orderRequest.quantity());
            orderRepository.save(order);
        } else {
            throw new RuntimeException("Product with skuCode " + orderRequest.skuCode() + " is out of stock");
        }
        
    }

}