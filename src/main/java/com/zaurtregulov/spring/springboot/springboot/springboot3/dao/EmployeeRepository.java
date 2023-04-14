package com.zaurtregulov.spring.springboot.springboot.springboot3.dao;


import com.zaurtregulov.spring.springboot.springboot.springboot3.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}