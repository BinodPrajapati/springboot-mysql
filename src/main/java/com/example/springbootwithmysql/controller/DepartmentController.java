package com.example.springbootwithmysql.controller;

import java.util.List;

//import javax.validation.Valid;

//Importing required classes
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootwithmysql.model.Department;
import com.example.springbootwithmysql.service.DepartmentService;

//Annotation
@RestController
@RequestMapping("/departments")
public class DepartmentController {

	// Annotation
	@Autowired
	private DepartmentService departmentService;

	// Save operation
	@PostMapping("/addDepartment")
	public List<Department> saveDepartment(@RequestBody List<Department> departments) {
		return departmentService.saveDepartment(departments);
	}

	// Read operation
	@GetMapping("/fetchDepartment")
	public List<Department> fetchDepartmentList() {
		return departmentService.fetchDepartmentList();
	}

	// Update operation
	@PutMapping("/updateDepartment/{id}")
	public Department updateDepartment(@RequestBody Department department, @PathVariable("id") Long departmentId) {
		return departmentService.updateDepartment(department, departmentId);
	}

	// Delete operation
	@DeleteMapping("/deleteDepartment/{id}")
	public String deleteDepartmentById(@PathVariable("id") Long departmentId) {
		departmentService.deleteDepartmentById(departmentId);
		return "Deleted Successfully";
	}
}
