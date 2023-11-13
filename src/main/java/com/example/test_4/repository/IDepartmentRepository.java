package com.example.test_4.repository;
import com.example.test_4.modle.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface IDepartmentRepository extends JpaRepository<Department,Long> {
}
