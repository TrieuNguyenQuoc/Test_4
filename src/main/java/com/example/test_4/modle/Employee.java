package com.example.test_4.modle;

import org.springframework.data.repository.cdi.Eager;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private String name;
    private int Age;
    private String price;
    @ManyToOne
    private Department department;

    public Employee() {
    }

    public Employee (Long id, String name, int age, String price, Department department) {
        this.id = id;
        this.name = name;
        Age = age;
        this.price = price;
        this.department = department;
    }

    public Long getId ( ) {
        return id;
    }

    public void setId (Long id) {
        this.id = id;
    }

    public String getName ( ) {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getAge ( ) {
        return Age;
    }

    public void setAge (int age) {
        Age = age;
    }

    public String getPrice ( ) {
        return price;
    }

    public void setPrice (String price) {
        this.price = price;
    }

    public Department getDepartment ( ) {
        return department;
    }

    public void setDepartment (Department department) {
        this.department = department;
    }
}
