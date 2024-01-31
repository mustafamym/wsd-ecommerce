package com.wsd.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "orders")
public class Order {
    @Column(name = "order_date")
    protected LocalDate orderDate;
    @Column(name = "sale_date")
    protected LocalDate saleDate;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal saleAmount;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
}
