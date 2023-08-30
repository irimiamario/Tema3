package com.example.demoJPA.model;


import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class Orders {
    @Id
    @GeneratedValue
    Integer id;

    Date order_date;

    Date shipped_date;

    String status;

    String comments;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customers customer;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<OrderDetails> orderDetails = new ArrayList<>();

    public void addOrderDetail(OrderDetails orderDetail) {
        orderDetails.add(orderDetail);
        orderDetail.setOrder(this);
    }


}
