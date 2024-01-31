package com.wsd.controller;

import com.wsd.service.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.LocalDate;

@RestController
@RequestMapping(path = "/api/sales", produces = {"application/json"})
public class SalesController {
    @Autowired
    private SalesService orderService;

    @GetMapping("total-amount/current-day")
    public BigDecimal getTotalSaleAmountForCurrentDay() {
        return orderService.getTotalSaleAmountForCurrentDay();
    }

    @GetMapping("/max-sale-day")
    public LocalDate getMaxSaleDay(
            @RequestParam("startDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate startDate,
            @RequestParam("endDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate endDate) {
        return orderService.getMaxSaleDay(startDate, endDate);
    }
}
