package com.fiit.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

/**
 * Vehicle POJO class
 */
@Component
public class Vehicle {
    private String brandName;

    public Vehicle() {
        System.out.println("Vehicle bean is created by Spring-Context.");
    }

    @PostConstruct
    public void initialize() {
        System.out.println("After constructor creation.. call the initialize method.");
        this.brandName = "Suzuki";
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Calling destroy method.");
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
