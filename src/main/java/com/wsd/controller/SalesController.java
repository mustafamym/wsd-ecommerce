package com.wsd.controller;

import com.wsd.service.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<BigDecimal> getCurrentDayOrders() {

        return new ResponseEntity<>(orderService.getTotalSaleAmountForCurrentDay(), HttpStatus.OK);
    }

    @GetMapping("/max-sale-day")
    public ResponseEntity<LocalDate> getMaxSaleDay(
            @RequestParam("startDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate startDate,
            @RequestParam("endDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate endDate) {

        return new ResponseEntity<>(orderService.getMaxSaleDay(startDate, endDate), HttpStatus.OK);
    }
}
