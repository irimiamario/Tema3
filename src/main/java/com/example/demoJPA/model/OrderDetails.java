package com.example.demoJPA.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class OrderDetails {
    @Id
    @GeneratedValue
    Integer id;

    String product_code;

    Integer quantity;

    Double priceEach;
}
