
package com.cg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class EmployeeMain {

    public static void main(String[] args) {
        //
        //ApplicationContext is the specification
        // implementation we are using is AnnotationConfigApplicationContext
        //
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        //
        //registering configuration class in which configurations are kept
        //
        Class configurationClass=JavaConfig.class;
        context.register(configurationClass);
        context.refresh();
       // context.registerShutdownHook();
        //
        //fetching bean by type
        //
        Employee employee = context.getBean(Employee.class);
        employee.display();
        SBU sbu = context.getBean(SBU.class);
        sbu.sbudisplay();
        context.close();
       // Shape shapeFetchedFromAppContext=context.getBean(Shape.class);
       
       // System.out.println(employee.getShape().getClass());
       // canvas.draw();

    }
}