package com.example.demoJPA.service;

import com.example.demoJPA.model.Products;
import com.example.demoJPA.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductsService {
    @Autowired
    ProductsRepository productsRepository;

    public void InsertProduct(Products p){
        productsRepository.save(p);
    }
}
