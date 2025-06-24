package com.fiit.main;

import com.fiit.beans.Vehicle;
import com.fiit.config.ProjectConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PrimayBean {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle vehicle = context.getBean(Vehicle.class);   //SpEL
        System.out.println("Vehicle name from spring context is "+vehicle.getBrandName());

    }
}
