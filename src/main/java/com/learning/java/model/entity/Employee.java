package com.learning.java.model.entity;

import com.learning.java.model.institution.Designation;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;

/**
 * Created by krvh271 on 1/8/18.
 */
@Data
@Entity
public class Employee {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private Designation designation;

}
