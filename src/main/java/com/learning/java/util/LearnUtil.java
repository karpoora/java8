package com.learning.java.util;

import com.learning.java.model.institution.Department;
import com.learning.java.model.institution.Semester;
import com.learning.java.model.institution.SemesterName;
import com.learning.java.model.institution.Staff;
import com.learning.java.model.institution.Student;
import java.util.Arrays;
import java.util.List;
import org.joda.time.Period;

/**
 * Created by krvh271 on 10/10/17.
 */
public class LearnUtil {
    public static List<Staff> getStaffs(){
        List<Staff> staffList= Arrays.asList(
        );
        return staffList;
    }

    public static List<Student> getStudents(){
        List<Student> studentList= Arrays.asList(
        );
        return studentList;
    }

    public static List<Semester> getSemesters(){
        List<Semester> semesterList= Arrays.asList(
                new Semester("2007",SemesterName.EVEN, Period.days(7),Period.ZERO,Period.ZERO),
                new Semester("2007",SemesterName.ODD, Period.days(7),Period.ZERO,Period.ZERO),
                new Semester("2006",SemesterName.EVEN, Period.days(6),Period.ZERO,Period.ZERO),
                new Semester("2006",SemesterName.ODD, Period.days(6),Period.ZERO,Period.ZERO),
                new Semester("2005",SemesterName.EVEN, Period.days(5),Period.ZERO,Period.ZERO),
                new Semester("2005",SemesterName.ODD, Period.days(5),Period.ZERO,Period.ZERO),
                new Semester("2004",SemesterName.EVEN, Period.days(4),Period.ZERO,Period.ZERO),
                new Semester("2004",SemesterName.ODD, Period.days(4),Period.ZERO,Period.ZERO),
                new Semester("2003",SemesterName.EVEN, Period.days(3),Period.ZERO,Period.ZERO),
                new Semester("2003",SemesterName.ODD, Period.days(3),Period.ZERO,Period.ZERO)
        );
        return semesterList;
    }

    public static List<Department> getDepartments(){
        List<Department> departmentList= Arrays.asList(
        );
        return departmentList;
    }
}
