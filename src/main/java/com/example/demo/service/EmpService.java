package com.example.demo.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.UserRepo;

@Service
public class EmpService {
	
	@Autowired
	UserRepo userRepo;
	
	public List<Employee> getAll(){
		return userRepo.getAll();
		
	}

	public String add(Employee emp) {
		// TODO Auto-generated method stub
		return userRepo.createEmployee(emp);
	}

	public String edit(Employee emp) {
		// TODO Auto-generated method stub
		return userRepo.updateEmployee(emp);
	}

	public String empNo(int empNo) {
		  return userRepo.delete(empNo);
	}

}
