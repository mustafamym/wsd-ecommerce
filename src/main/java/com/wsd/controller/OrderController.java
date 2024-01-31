package com.wsd.controller;

import com.wsd.dto.OrderDto;
import com.wsd.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/orders", produces = {"application/json"})
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("current-day")
    public List<OrderDto> getCurrentDayOrders() {
        return orderService.getOrdersForCurrentDay();
    }

    @GetMapping("{customerId}/orders")
    public List<OrderDto> getOrdersByCustomer(@PathVariable Long customerId) {
        return orderService.getOrdersByCustomer(customerId);
    }

}
