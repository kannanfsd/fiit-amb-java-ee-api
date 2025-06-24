package com.fiit.main;

import com.fiit.beans.Vehicle;
import com.fiit.config.ProjectConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class NewBean {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle();
        vehicle1.setBrandName("Honda");
        System.out.println("Vehicle name from non-spring context is "+vehicle1.getBrandName());
        /**
         * Spring IoC Container - BeanFactory or ApplicationContext
         */
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        /**
         * Spring Expression Language
         */
        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println("Vehicle name from spring context is "+vehicle.getBrandName());
        System.out.println("Model: "+vehicle.getModel());

        String myLocation = context.getBean(String.class);  //SpEL
        System.out.println("Location: "+myLocation);

        Long myPhoneNumber = context.getBean(Long.class);
        System.out.println("Phone number: "+myPhoneNumber);
    }
}
