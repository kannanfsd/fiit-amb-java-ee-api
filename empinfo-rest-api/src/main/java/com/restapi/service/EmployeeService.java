package com.restapi.service;

import com.restapi.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    public List<Employee> getAllEmployees();
    public Optional<Employee> getEmployeeById(int id);
    public Employee save(Employee employee);
    public Employee update(int id, Employee employee);
    public void delete(int id);
}
