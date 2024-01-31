package com.wsd.service;

import com.wsd.dto.OrderDto;

import java.util.List;

public interface OrderService {
    List<OrderDto> getOrdersForCurrentDay();

    List<OrderDto> getOrdersByCustomer(Long customerId);
}
