package com.learning.java.model.institution;


import lombok.Data;
import org.joda.time.DateTime;

/**
 * Created by krvh271 on 8/15/17.
 */
@Data
public class Staff {
    private String name;
    private DateTime dob;
    private DateTime doj;
    private Long salary;
    private Department department;
    private Gender gender;
    private Address address;
    private String contactNo;
    private String email;
    private Designation designation;
    private Role role;
    private Boolean boardMember=false;

}
