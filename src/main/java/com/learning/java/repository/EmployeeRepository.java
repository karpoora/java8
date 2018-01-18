package com.learning.java.repository;

import com.learning.java.model.entity.Employee;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by krvh271 on 1/9/18.
 */
@Repository
public class EmployeeRepository {
    @Autowired
    EntityManager entityManager;

    public List<Employee> getEmployee(){
        TypedQuery<Employee> query = entityManager.createQuery("select e from Employee e", Employee.class);
        List<Employee> resultList = query.getResultList();
        return resultList;
    }
}
