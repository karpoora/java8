package com.learning.java.controller;

import com.learning.java.model.entity.Employee;
import com.learning.java.service.EmployeeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by krvh271 on 1/9/18.
 */
@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping(path = "employee")
    ResponseEntity<List<Employee>> getEmployee(){
        List<Employee> employees = employeeService.getEmployee();
        ResponseEntity responseEntity=new ResponseEntity(employees, HttpStatus.FOUND);
        return responseEntity;
    }
}
