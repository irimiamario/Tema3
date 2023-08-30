package com.example.demoJPA.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
public class Customers {

    @Id
    @GeneratedValue
    Integer id;

    String username;

    String last_name;

    String first_name;

    String phone;

    String address;

    String city;

    String postalCode;

    String country;
}

