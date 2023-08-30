package com.example.demoJPA.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

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

    Integer customer_id;

}
