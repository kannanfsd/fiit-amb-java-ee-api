package com.fiit.main;

import com.fiit.beans.Vehicle;
import com.fiit.config.ProjectConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComponentBean {
    public static void main(String[] args) {
        System.out.println("Before object creation.");
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        System.out.println("After object created.");
        Vehicle vehicle = context.getBean(Vehicle.class);   //SpEL
        System.out.println("Vehicle name from spring context is "+vehicle.getBrandName());

    }
}
