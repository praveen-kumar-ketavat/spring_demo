package com.example.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.entity.Department;
import com.example.entity.Employee;
import com.example.service.EmployeeService;
@RestController
public class EmployeeController {
	@Autowired
	EmployeeService service;
	
	@GetMapping("/viewEmployees")
	public List<Employee> getAllEmployees(){
		return service.getAllEmployees();
	}
	@PostMapping("/addEmployee")
	public String addEmployee(@RequestBody Employee empobj) {
		return service.addEmployee(empobj);
	}
}
