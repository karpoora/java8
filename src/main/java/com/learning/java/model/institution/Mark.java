package com.learning.java.model.institution;

import java.util.Map;
import lombok.Data;

/**
 * Created by krvh271 on 9/30/17.
 */
@Data
public class Mark {
    private Map<Subject,Integer> subjectMark;
}
