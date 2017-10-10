package com.learning.java.model.institution;

import java.util.Map;
import lombok.Data;
import org.joda.time.DateTime;
import sun.jvm.hotspot.oops.Mark;

/**
 * Created by krvh271 on 9/30/17.
 */
@Data
public class Student {
    private String name;
    private DateTime dob;
    private Address address;
    private String contactNo;
    private String email;
    private Department department;
    private String admissionNumber;
    private DateTime doj;
    private String registerNumber;
    private Map<Semester,Mark> marks;
}
