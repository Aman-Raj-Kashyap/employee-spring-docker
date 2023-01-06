package com.nagarro.SpringBootCRUD.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.SpringBootCRUD.model.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer>{

}
