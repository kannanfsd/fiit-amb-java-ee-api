package com.fiit.main;

import com.fiit.beans.Vehicle;
import com.fiit.config.ProjectConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SampleBean {
    public static void main(String[] args) {
        System.out.println("Before application context");
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        System.out.println("After application context");
        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println("Vehicle Brand Name is "+vehicle.getBrand());
    }
}
