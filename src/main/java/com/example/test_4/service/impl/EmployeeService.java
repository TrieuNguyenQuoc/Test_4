package com.example.test_4.service.impl;

import com.example.test_4.modle.Employee;
import com.example.test_4.repository.IEmployeeRepository;
import com.example.test_4.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class EmployeeService implements IEmployeeService {
    @Autowired
    private IEmployeeRepository employeeRepository;
    @Override
    public Iterable<Employee> findAll(){return employeeRepository.findAll();}
    @Override
    public Employee findOne (Long id){
        Optional<Employee> employeeOptional = employeeRepository.findById(id);
        return employeeOptional.orElse(null);
    }
    @Override
    public void save (Employee employee){employeeRepository.save(employee);}
    @Override
    public void delete(Long id){employeeRepository.deleteById(id);}

}
