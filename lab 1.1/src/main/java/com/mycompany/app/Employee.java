package com.mycompany.app;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

public class Employee {

@Value("${id}")
private int id;
@Value("${name}")
private String name;
@Value("${salary}")
private double salary;
@Value("${bu}")
private String bu;
@Value("${age}")
private int age;

public Employee() {
}

public void display() {
	System.out.println("Employee Details");
	System.out.println("------------------------");
	System.out.println("Employee ID : "+id);
	System.out.println("Employee Name : "+name);
	System.out.println("Employee Salary : "+salary);
	System.out.println("Employee Buisness Unit : "+bu);
	System.out.println("Employee Age : "+age);
	
}
}






