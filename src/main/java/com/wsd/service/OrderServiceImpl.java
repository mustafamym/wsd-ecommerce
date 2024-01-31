package com.wsd.service;

import com.wsd.dto.OrderDto;
import com.wsd.mapper.CustomerMapper;
import com.wsd.mapper.OrderMapper;
import com.wsd.model.Customer;
import com.wsd.model.Order;
import com.wsd.repository.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class OrderServiceImpl implements OrderService {

    CustomerServiceImpl customerService;
    private OrderRepository orderRepository;
    private OrderMapper orderMapper;

    @Override
    public List<OrderDto> getOrdersForCurrentDay() {
        LocalDate currentDate = LocalDate.now();
        List<Order> orders = orderRepository.findByOrderDate(currentDate);
        return orders.stream()
                .map(orderMapper::mapOrderToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<OrderDto> getOrdersByCustomer(Long customerId) {
        // Assume you have a method to retrieve customer by ID from customer service
        Customer customer = customerService.getCustomerById(customerId);
        List<Order> orders = orderRepository.findByCustomer(customer);
        return orders.stream()
                .map(orderMapper::mapOrderToDTO)
                .collect(Collectors.toList());
    }

}