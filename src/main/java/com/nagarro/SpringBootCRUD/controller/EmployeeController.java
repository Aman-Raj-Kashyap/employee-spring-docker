package com.nagarro.SpringBootCRUD.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.SpringBootCRUD.dao.EmployeeDao;
import com.nagarro.SpringBootCRUD.model.Employee;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeDao dao;
	
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee employee) {
		System.out.print("reached..");
		return dao.save(employee);
	}
	
	@GetMapping("/employees")
	public List<Employee> getEmployees(){
		return dao.findAll();
	}
}
