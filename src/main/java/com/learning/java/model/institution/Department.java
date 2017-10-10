package com.learning.java.model.institution;

import java.util.List;
import java.util.Map;
import lombok.Data;

/**
 * Created by krvh271 on 9/30/17.
 */
@Data
public class Department {
    private String name;
    private List<Staff> staffList;
    private List<Map<Semester,List<Subject>>> semesterSubjectMapList;
    private List<Student> studentList;
}
