package com.wsd.dto;


import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Builder
@Data
public class OrderDto {
    protected LocalDate orderDate;
    protected LocalDate saleDate;
    private Long id;
    private BigDecimal saleAmount;
    private CustomerDto customer;
}
