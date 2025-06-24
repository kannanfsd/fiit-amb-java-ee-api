package com.fiit.config;

import com.fiit.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * SpringContext Framework
 */

@Configuration
public class ProjectConfig {

    /**
     * Spring Beans
     * @return
     */
    @Bean
    Vehicle vehicle() {
        Vehicle vehicle = new Vehicle();
        vehicle.setBrandName("Audi");
        return vehicle;
    }

    @Bean
    String location() {
        return "I am in Chennai.";
    }

    @Bean
    Long phoneNumber() {
        return 12345789L;
    }
}
