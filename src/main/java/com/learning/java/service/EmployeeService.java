package com.learning.java.service;

import com.learning.java.model.entity.Employee;
import com.learning.java.repository.EmployeeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by krvh271 on 1/9/18.
 */

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> getEmployee(){
        return employeeRepository.getEmployee();
    }
}
