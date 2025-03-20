package com.javaB9.common.mapper;

import com.javaB9.common.dto.OrderRequestDTO;
import com.javaB9.entity.Order;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class OrderDTOtoEntityMapper {


    public Order map(OrderRequestDTO orderRequestDTO) {
        return
                Order.builder()
                        .customerId(orderRequestDTO.getCustomerId())
                        .name(orderRequestDTO.getName())
                        .productType(orderRequestDTO.getProductType())
                        .quantity(orderRequestDTO.getQuantity())
                        .price(orderRequestDTO.getPrice())
                        .orderDate(new Date())
                        .build();
    }
}
