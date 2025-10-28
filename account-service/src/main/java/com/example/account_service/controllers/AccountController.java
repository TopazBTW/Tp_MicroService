package com.example.account_service.controllers;

import com.example.account_service.entities.Account;
import com.example.account_service.models.Customer;
import com.example.account_service.repositories.AccountRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@AllArgsConstructor
public class AccountController {
    private AccountRepository accountRepository;
    @GetMapping("/accounts")
    private List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }
    @GetMapping("/accounts/{id}")
    private Account getCustomerbyId(@PathVariable String id) {
        return accountRepository.findById(id).get();
    }
}
