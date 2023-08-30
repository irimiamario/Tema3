package com.example.demoJPA.controller;

import com.example.demoJPA.model.Orders;
import com.example.demoJPA.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class OrdersController {
    @Autowired
    OrdersService ordersService;

    @PostMapping("/createOrder")
    public void createOrder() {
        Orders order = new Orders();
        List<String> productCodes = Arrays.asList("code1", "code2", "code3", "code4", "code5");
        ordersService.createOrderWithProducts(order, productCodes);
    }

    @GetMapping("/ordersByCustomer/{customerId}")
    public List<Orders> getOrdersByCustomer(@PathVariable Integer customerId) {
        return ordersService.getOrdersByCustomerId(customerId);
    }


}
