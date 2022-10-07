package com.example.springbootwithmysql.service;

import java.util.List;

import com.example.springbootwithmysql.model.Department;

public interface DepartmentService {

	// Save operation
	List<Department>  saveDepartment(List<Department>  departments);

	// Read operation
	List<Department> fetchDepartmentList();

	// Update operation
	Department updateDepartment(Department department, Long departmentId);

	// Delete operation
	void deleteDepartmentById(Long departmentId);
}

