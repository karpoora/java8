package com.learning.java.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;

/**
 * Created by krvh271 on 1/9/18.
 */
@Data
@Entity
public class Contacts {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String mobile;
}
