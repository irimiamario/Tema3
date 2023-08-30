package com.example.demoJPA.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Payments {
    @Id
    @GeneratedValue
    Integer customer_id;

    Date payment_date;

    Double amount;
}
