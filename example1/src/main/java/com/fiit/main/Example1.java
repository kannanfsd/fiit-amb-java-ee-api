package com.fiit.main;

import com.fiit.beans.Vehicle;
import com.fiit.config.VehicleConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example1 {
    public static void main(String[] args) {
        var v = new Vehicle();
        v.setBrandName("Honda");
        System.out.println("Vehicle name from non-spring context is "+v.getBrandName());

        var context = new AnnotationConfigApplicationContext(VehicleConfig.class);

        var vehicle1 = context.getBean("vehicle1", Vehicle.class);
        System.out.println("Vehicle name from spring context is "+vehicle1.getBrandName());

        var vehicle2 = context.getBean("vehicle2", Vehicle.class);
        System.out.println("Vehicle name from spring context is "+vehicle2.getBrandName());
    }
}
