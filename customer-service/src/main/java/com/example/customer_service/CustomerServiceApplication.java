package com.example.customer_service;

import com.example.customer_service.entities.Customer;
import com.example.customer_service.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}
@Bean
CommandLineRunner init(CustomerRepository customerRepository) {
        return args -> {
            Customer customer1 = Customer.builder()
                    .firstName("Taha")
                    .lastName("Kumar")
                    .email("Taha@gmail.com")
                    .build();
            customerRepository.save(customer1);
            Customer customer2 = Customer.builder()
                    .firstName("Houbid")
                    .lastName("Kumar")
                    .email("Houbid@gmail.com")
                    .build();
            customerRepository.save(customer2);
        };
}
}
