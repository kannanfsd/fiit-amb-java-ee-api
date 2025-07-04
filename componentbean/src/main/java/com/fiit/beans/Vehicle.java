package com.fiit.beans;

import org.springframework.stereotype.Component;

/**
 * Vehicle POJO class
 */
@Component
public class Vehicle {
    private String brandName;

    public Vehicle() {
        System.out.println("Vehicle bean is created by Spring-Context.");
        brandName = "BMW";
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getModel(){
        return "FIIT - Online";
    }
}
