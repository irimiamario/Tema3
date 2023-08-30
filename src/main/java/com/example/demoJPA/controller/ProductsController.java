package com.example.demoJPA.controller;

import com.example.demoJPA.model.Products;
import com.example.demoJPA.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsController {
    @Autowired
    ProductsService productsService;

    @PostMapping(value = "/insertProduct")
    public void InsertProduct(){
        Products p = new Products();
        p.setName("Coca-Cola");
        p.setStock(100);
        p.setDescription("Un suc foarte foarte bun!");
        p.setPrice(7.99);
        productsService.InsertProduct(p);
    }

}
