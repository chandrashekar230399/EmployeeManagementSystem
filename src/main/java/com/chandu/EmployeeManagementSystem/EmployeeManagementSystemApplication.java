package com.chandu.EmployeeManagementSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.chandu.EmployeeManagementSystem.Controller.EmployeeController;

@SpringBootApplication
public class EmployeeManagementSystemApplication implements CommandLineRunner {

	@Autowired
	private EmployeeController employeecontroller;
	
	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementSystemApplication.class);
		
		
		ApplicationContext context = new AnnotationConfigApplicationContext();
		try {
			context.getBean(EmployeeManagementSystemApplication.class).run(args);
		} catch (Exception e) {
		
			System.out.println(e.getMessage());
		} 
		
	}

	@Override
	public void run(String... args) throws Exception {
		employeecontroller.displayDetails();
		
		
	}

}
