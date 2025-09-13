package com.restapi.service;

import com.restapi.entity.Employee;
import com.restapi.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Optional<Employee> getEmployeeById(int id) {
        return employeeRepository.findById(id);
    }

    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee update(int id, Employee employee) {
        Employee emp = employeeRepository.findById(id).orElseThrow(()->new RuntimeException("Employee not found with id "+id));
        emp.setFirstName(employee.getFirstName());
        emp.setLastName(employee.getLastName());
        emp.setEmail(employee.getEmail());
        emp.setPhone(employee.getPhone());
        return employeeRepository.save(emp);
    }

    @Override
    public void delete(int id) {
        Employee emp = employeeRepository.findById(id).orElseThrow(()->new RuntimeException("Employee not found with id "+id));
        employeeRepository.delete(emp);
    }
}
