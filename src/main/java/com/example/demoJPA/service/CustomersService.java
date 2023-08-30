package com.example.demoJPA.service;

import com.example.demoJPA.model.Customers;
import com.example.demoJPA.repository.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomersService {
    @Autowired
    CustomersRepository customersRepository;

    public void CreateCustomer(Customers c){
        customersRepository.save(c);
    }
}
