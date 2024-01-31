package com.wsd.mapper;

import com.wsd.dto.CustomerDto;
import com.wsd.model.Customer;
import org.springframework.stereotype.Component;

@Component

public class CustomerMapper {

    public CustomerDto mapCustomerToDTO(Customer customer) {
        if (customer == null) {
            return null;
        }

        return CustomerDto.builder()
                .id(customer.getId())
                .name(customer.getName())
                .email(customer.getEmail())
                .build();
    }
}
