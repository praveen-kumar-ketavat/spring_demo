package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Employee;
import com.example.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository repo;
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
//	public Employee addEmployee(Employee empobj) {
//		// TODO Auto-generated method stub
//		return repo.save(empobj);
//	}
	
	public String addEmployee(Employee empobj) {
	    Optional<Employee> existingEmployeeById = repo.findById(empobj.getId());
	    Optional<Employee> existingEmployeeByName = repo.findByName(empobj.getName());

	    if (existingEmployeeById.isPresent()) {
	        if (existingEmployeeById.get().getName().equals(empobj.getName())) {
	            return "Employee already exists with the same ID and Name";
	        } else {
	            return "ID already assigned to another employee";
	        }
	    }
	    repo.save(empobj);
	    return "Employee added successfully!";
	}

}
