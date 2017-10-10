package com.learning.java.model.institution;

import java.net.URL;
import java.util.List;
import lombok.Data;

/**
 * Created by krvh271 on 9/30/17.
 */
@Data
public class College {
    private String name;
    private Address address;
    private Staff principal;
    private Staff correspondent;
    private List<Staff> boardMembers;
    private List<Department> departmentList;
    private URL website;
}
