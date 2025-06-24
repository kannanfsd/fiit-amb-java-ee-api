package com.fiit.config;

import com.fiit.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VehicleConfig {
    /**
     * The var keyword was introduced in java 10. Type inference is used var keyword in which
     * it detects automatically the datatype of a variable based on the surrounding context.
     */
    @Bean
    public Vehicle vehicle1() {
        var v = new Vehicle();
        v.setBrandName("Audi-8");
        return v;
    }
    @Bean
    public Vehicle vehicle2() {
        var v = new Vehicle();
        v.setBrandName("Ferrari");
        return v;
    }
}
