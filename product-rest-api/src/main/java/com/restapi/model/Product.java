package com.restapi.model;

import jakarta.persistence.Entity;

@Entity
public class Product {

    private Long id;
    private String name;
    private Double price;

}