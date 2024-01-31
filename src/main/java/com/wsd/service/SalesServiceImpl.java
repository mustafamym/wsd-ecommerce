package com.wsd.service;

import com.wsd.model.Order;
import com.wsd.repository.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Service
@AllArgsConstructor
public class SalesServiceImpl implements SalesService {

    private OrderRepository orderRepository;

    @Override
    public BigDecimal getTotalSaleAmountForCurrentDay() {
        LocalDate currentDate = LocalDate.now();
        List<Order> orders = orderRepository.findByOrderDate(currentDate);
        BigDecimal totalSaleAmount = BigDecimal.ZERO;
        for (Order order : orders) {
            totalSaleAmount = totalSaleAmount.add(order.getSaleAmount());
        }
        return totalSaleAmount;
    }


    @Override
    public LocalDate getMaxSaleDay(LocalDate startDate, LocalDate endDate) {
        List<Order> orders = orderRepository.findBySaleDateBetween(startDate, endDate);
        LocalDate maxSaleDay = null;
        BigDecimal maxSaleAmount = BigDecimal.ZERO;

        for (Order order : orders) {
            if (order.getSaleAmount().compareTo(maxSaleAmount) > 0) {
                maxSaleAmount = order.getSaleAmount();
                maxSaleDay = order.getSaleDate();
            }
        }

        return maxSaleDay;
    }
}