package com.cg;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.mycompany.app")
@PropertySource("classpath:values.properties")
public class JavaConfig {
@Bean
public Employee employee() {
	Employee employee=new Employee();
	return employee;
}

@Bean
public SBU sbu() {
	SBU sbu=new SBU();
	return sbu;
}

}
