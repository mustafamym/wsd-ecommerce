package com.wsd.controller;

import com.wsd.dto.CustomerDto;
import com.wsd.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/customers", produces = {"application/json"})
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("")
    public ResponseEntity<List<CustomerDto>> createAccount() {

        return new ResponseEntity<>(customerService.getAllCustomers(), HttpStatus.OK);
    }
}
