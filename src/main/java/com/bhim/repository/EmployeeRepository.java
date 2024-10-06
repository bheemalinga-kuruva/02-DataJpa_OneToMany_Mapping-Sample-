package com.bhim.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bhim.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
