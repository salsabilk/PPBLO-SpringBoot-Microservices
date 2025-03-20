package com.javaB9.service;

import com.javaB9.common.dto.OrderRequestDTO;
import com.javaB9.common.mapper.OrderDTOtoEntityMapper;
import com.javaB9.common.mapper.OrderEntityToOutboxEntityMapper;
import com.javaB9.entity.Order;
import com.javaB9.entity.Outbox;
import com.javaB9.repository.OrderRepository;
import com.javaB9.repository.OutboxRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderDTOtoEntityMapper orderDTOtoEntityMapper;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OutboxRepository outboxRepository;

    @Autowired
    private OrderEntityToOutboxEntityMapper orderEntityToOutboxEntityMapper;


    @Transactional
    public Order createOrder(OrderRequestDTO orderRequestDTO) {

        Order order = orderDTOtoEntityMapper.map(orderRequestDTO);
        order = orderRepository.save(order);

        Outbox outbox = orderEntityToOutboxEntityMapper.map(order);
        outboxRepository.save(outbox);

        return order;
    }
}
