package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;

@Repository
public class UserRepo {
	public List<Employee> employee = new ArrayList<Employee>();

	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return employee ;
	}

	public String createEmployee(Employee emp) {
		// TODO Auto-generated method stub
		employee.add(emp);
		return("Sucesfully added");
		
	}

	public String updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		employee.stream().filter(e -> e.getEid() == emp.getEid()).forEach(e ->
		{
			e.setDept(emp.getDept());
			e.setName(emp.getName());
		});
		return "Updated";
	}

	public String delete(int empNo) {
		employee.remove(empNo-1);
		return "Deleted";
	} 

}