package com.bhim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.bhim.model.Employee;
import com.bhim.service.EmployeeService;

@SpringBootApplication
public class DataJpaOneToManySampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DataJpaOneToManySampleApplication.class, args);
		EmployeeService empservice = context.getBean(EmployeeService.class);
		
		// empservice.saveEmployee();
		//  empservice.getEmployee();
		//empservice.getaddress();
		empservice.deleteEmployee();
	}

}
