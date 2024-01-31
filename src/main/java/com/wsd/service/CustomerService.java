package com.wsd.service;

import com.wsd.dto.CustomerDto;
import com.wsd.model.Customer;

import java.util.List;

public interface CustomerService {
    List<CustomerDto> getAllCustomers();

    Customer getCustomerById(Long customerId);
}
