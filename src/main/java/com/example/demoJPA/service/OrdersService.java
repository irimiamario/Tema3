package com.example.demoJPA.service;

import com.example.demoJPA.model.OrderDetails;
import com.example.demoJPA.model.Orders;
import com.example.demoJPA.model.Products;
import com.example.demoJPA.repository.OrdersRepository;
import com.example.demoJPA.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrdersService {
    @Autowired
    OrdersRepository ordersRepository;

    @Autowired
    ProductsRepository productsRepository;

    public void createOrderWithProducts(Orders order, List<String> productCodes) {
        Orders savedOrder = ordersRepository.save(order);

        List<Products> products = productsRepository.findAllByCodeIn(productCodes);

        for (Products product : products) {
            OrderDetails orderDetail = new OrderDetails();
            orderDetail.setProduct(product);
            orderDetail.setQuantity(1);
            orderDetail.setPriceEach(product.getPrice());
            savedOrder.addOrderDetail(orderDetail);
        }

        ordersRepository.save(savedOrder);
    }

    public List<Orders> getOrdersByCustomerId(Integer customerId) {
        return ordersRepository.findByCustomerId(customerId);
    }
}
