package com.learning.java.model.institution;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.joda.time.Period;

/**
 * Created by krvh271 on 9/30/17.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Semester {
    private String educationalYear;
    private SemesterName name;
    private Period examSchedule;
    private Period issueHallTicket;
    private Period holidays;
}
