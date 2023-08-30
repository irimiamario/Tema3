package com.example.demoJPA.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class OrderDetails {
    @Id
    @GeneratedValue
    Integer id;

    Integer quantity;

    Double priceEach;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Orders order;

    @ManyToOne
    @JoinColumn(name = "product_code")
    private Products product;
}
