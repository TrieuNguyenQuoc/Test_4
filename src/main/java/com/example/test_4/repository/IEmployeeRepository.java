package com.example.test_4.repository;

import com.example.test_4.modle.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IEmployeeRepository extends JpaRepository<Employee,Long> {
//    List<Employee> search (String name);
//    @Query(value = select * from emlloyee where employee.name like %?%",nativeQuery = true)
}
