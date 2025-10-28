package com.example.account_service.entities;

import com.example.account_service.enums.AccountType;
import com.example.account_service.models.Customer;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;

import java.util.Date;

@Entity
public class Account {
    @Id
    private String accountId;
    private double balance;
    private String currency;
    private AccountType accountType;
    @Transient
    private Customer customer;
    private Long customerId;
    private Date creationDate;

}
