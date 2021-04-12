package com.example.demo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entity.Employee;
import com.example.demo.repository.UserRepo;

@SpringBootApplication
public class DemoApplication {
 
//	@Autowired
//	UserRepo userRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
	}

//	@Override
//	public void run(String... args) throws Exception {
//		Employee e1 = new Employee(1, "narsi", "dev");
//		Employee e2 = new Employee(2, "lil pop", "music");
//		
//		userRepo.employee.addAll(Arrays.asList(e1, e2));
//	}
//
//	
		
	}
	
	
