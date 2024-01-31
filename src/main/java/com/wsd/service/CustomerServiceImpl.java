package com.wsd.service;

import com.wsd.dto.CustomerDto;
import com.wsd.mapper.CustomerMapper;
import com.wsd.model.Customer;
import com.wsd.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@Log4j2
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;
    private CustomerMapper customerMapper;

    @Override
    public List<CustomerDto> getAllCustomers() {
        List<Customer> customers = customerRepository.findAll();
        log.info("start mapping Customer entity to CustomerDto list");
        return customers.stream()
                .map(customerMapper::mapCustomerToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public Customer getCustomerById(Long customerId) {
        return customerRepository.findById(customerId).orElse(null);
    }
}
