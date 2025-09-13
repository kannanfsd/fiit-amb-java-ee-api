package com.fiit.config;

import com.fiit.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    public Vehicle vehicle() {
        Vehicle vehicle = new Vehicle();
        vehicle.setBrand("Audi");
        return vehicle;
    }
}
