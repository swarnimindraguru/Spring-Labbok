package com.cg.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.cg.entities.Employee;

@Component
public class EmployeeDaoImpl implements IEmployeeDao{

	private Map<Integer,Employee>store=new HashMap<>();
	
	 public EmployeeDaoImpl(){
	        store.put(100,new Employee(100,"Swarnim",5000.695));
	        store.put(101,new Employee(101,"Aman",60000.78));
	        store.put(102,new Employee(102,"Shivam",42000.26));
	        store.put(103,new Employee(103,"Amit",91000.48));
	        store.put(104,new Employee(104,"Shyam",73000.64));
	        store.put(105,new Employee(105,"Rahul",12000.76));
	    }
	 
	 @Override
	 public Employee fetchById(int id) {
		 Employee employee = null;
		 if(store.containsKey(id)) {
			  employee=store.get(id);
		 }
		 return employee;
	 }
	 


}
