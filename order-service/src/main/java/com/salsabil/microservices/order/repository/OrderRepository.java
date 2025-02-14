package com.salsabil.microservices.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salsabil.microservices.order.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
