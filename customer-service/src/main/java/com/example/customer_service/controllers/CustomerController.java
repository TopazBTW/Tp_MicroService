package com.example.customer_service.controllers;

import com.example.customer_service.entities.Customer;
import com.example.customer_service.repositories.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class CustomerController {
    private CustomerRepository customerRepository;
    @GetMapping("/customers")
    private List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }
    @GetMapping("/customers/{id}")
    private Customer getCustomerbyId(@PathVariable Long id) {
        return customerRepository.findById(id).get();
    }
}
