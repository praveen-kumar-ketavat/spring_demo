package com.example.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.entity.Employee;

//Tablename (name of the entiry class), datatype of primarykey
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String> {

	Optional<Employee> findByName(String name);

}
