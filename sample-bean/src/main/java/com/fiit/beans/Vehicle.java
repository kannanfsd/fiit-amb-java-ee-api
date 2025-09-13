package com.fiit.beans;

/**
 * Vehicle POJO class
 */
public class Vehicle {
    private String brand;
    public Vehicle(){
        System.out.println("Vehicle instance created by spring-context.");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
