package com.example.demoJPA.controller;

import com.example.demoJPA.model.Products;
import com.example.demoJPA.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @PostMapping(value = "/insert10Products")
    public void insert10Products(){
        for (int i = 0; i < 10; i++) {
            Products p = new Products();
            p.setName("Produsul " + i);
            p.setStock(101 + i);
            p.setDescription("Produsul cu numarul " + i + " din lista de produse!");
            p.setPrice(5.00);
            productsService.InsertProduct(p);
        }
    }

    @GetMapping("/products")
    public List<Products> getAllProducts() {
        return productsService.getAllProducts();
    }


}
