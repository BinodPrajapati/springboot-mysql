package com.example.springbootwithmysql.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.example.springbootwithmysql.model.Department;
import com.example.springbootwithmysql.repository.DepartmentRepository;
import com.example.springbootwithmysql.service.DepartmentService;
import com.example.springbootwithmysql.service.DepartmentServiceImpl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class DepartmentControllerTest {

    @Mock
    DepartmentServiceImpl departmentService;

    @Mock
    DepartmentRepository departmentRepository;

    private List<Department> departments = new ArrayList<>();

    @BeforeEach
    void setUp() {
       // departmentController = new DepartmentController();

        Department department1 = new Department(1L,"Account","Delhi","Delhi01");
        Department department2 = new Department(2L,"Finance","Mumbai","Mumbai01");
        departments.add(department1);
        departments.add(department2);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void saveDepartment() {
        List<Department> departments1 = departmentService.saveDepartment(departments);
        System.out.println(departments1.size());
        assertNotNull(departments1);
    }

    @Test
    void fetchDepartmentList() {
    }

    @Test
    void updateDepartment() {
    }

    @Test
    void deleteDepartmentById() {
    }
}