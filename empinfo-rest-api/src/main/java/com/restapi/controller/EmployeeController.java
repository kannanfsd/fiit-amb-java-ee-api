package com.restapi.controller;

import com.restapi.entity.Employee;
import com.restapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee/api")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public Employee save(@RequestBody Employee employee) {
        return employeeService.save(employee);
    }

    @GetMapping
    public List<Employee> getEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployee(@PathVariable int id) {
        Optional<Employee> employee = employeeService.getEmployeeById(id);
        return employee.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable int id, @RequestBody Employee employee) {
        try{
            Employee updatedEmployee = employeeService.update(id, employee);
            return ResponseEntity.ok(updatedEmployee);
        }catch (RuntimeException ex){
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable int id) {
        try {
            employeeService.delete(id);
            return ResponseEntity.noContent().build();
        }catch (RuntimeException ex){
            return ResponseEntity.notFound().build();
        }
    }
}
