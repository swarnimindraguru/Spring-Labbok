package com.cg;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

public class Employee {

@Value("${age}")
private int age;
@Value("${id}")
private int id;
@Value("${name}")
private String name;
@Value("${salary}")
private double salary;



public Employee() {
}

public void display() {
	System.out.println("Employee details");
	System.out.println("------------------------");
	System.out.println("Employee [ empAge = "+age+ ", empID = "+id+ ", empName = "+name+ ", empSalary = "+salary);
	
}
}






