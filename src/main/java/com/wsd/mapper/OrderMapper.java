package com.wsd.mapper;

import com.wsd.dto.OrderDto;
import com.wsd.model.Order;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class OrderMapper {

    private CustomerMapper customerMapper;

    public OrderDto mapOrderToDTO(Order order) {
        if (order == null) {
            return null;
        }

        return OrderDto.builder()
                .id(order.getId())
                .orderDate(order.getOrderDate())
                .saleAmount(order.getSaleAmount())
                .customer(customerMapper.mapCustomerToDTO(order.getCustomer()))
                .build();
    }
}
