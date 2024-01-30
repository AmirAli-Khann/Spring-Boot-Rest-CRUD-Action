package com.amiralifakhrabadi.springboot.cruddemo.service;

import com.amiralifakhrabadi.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theOd);
}
