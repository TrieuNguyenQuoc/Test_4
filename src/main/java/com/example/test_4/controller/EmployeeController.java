package com.example.test_4.controller;

import com.example.test_4.modle.Department;
import com.example.test_4.modle.Employee;
import com.example.test_4.repository.IDepartmentRepository;
import com.example.test_4.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/employee")
public class EmployeeController {
    @Autowired
    private IEmployeeService employeeService;

    @Autowired
    private IDepartmentRepository departmentRepository;

    @GetMapping("/department")
    public ResponseEntity<Iterable<Employee>> displayAll ( ) {
        return new ResponseEntity<>(employeeService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> findOne (@PathVariable Long id) {
        Employee employee = employeeService.findOne(id);
        if (employee != null) {
            return new ResponseEntity<>(employee, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<?> save (@RequestBody Employee employee) {
        employeeService.save(employee);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Employee> delete (@PathVariable long id) {
        Employee employee = employeeService.findOne(id);
        if (employee != null) {
            employeeService.delete(id);
            return new ResponseEntity<>(employee, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }



}
