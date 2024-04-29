package com.example.springbootwithmysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springbootwithmysql.model.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}