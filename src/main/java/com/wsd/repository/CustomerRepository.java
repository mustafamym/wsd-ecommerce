package com.wsd.repository;

import com.wsd.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    // Add custom methods if needed
}
