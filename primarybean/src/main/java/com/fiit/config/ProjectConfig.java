package com.fiit.config;

import com.fiit.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean(name = "audiVehicle")
    Vehicle vehicle1() {
        Vehicle vehicle = new Vehicle();
        vehicle.setBrandName("Audi");
        return vehicle;
    }

    @Bean(name ="hondaVehicle")
    Vehicle vehicle2() {
        Vehicle vehicle = new Vehicle();
        vehicle.setBrandName("Honda");
        return vehicle;
    }
    @Primary
    @Bean(name = "ferrariVehicle")
    Vehicle vehicle3() {
        Vehicle vehicle = new Vehicle();
        vehicle.setBrandName("Ferrari");
        return vehicle;
    }


}
