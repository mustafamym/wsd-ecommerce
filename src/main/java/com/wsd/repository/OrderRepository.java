package com.wsd.repository;

import com.wsd.model.Customer;
import com.wsd.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByOrderDate(LocalDate orderDate);

    List<Order> findByCustomer(Customer customer);

    List<Order> findBySaleDateBetween(LocalDate startDate, LocalDate endDate);
}
