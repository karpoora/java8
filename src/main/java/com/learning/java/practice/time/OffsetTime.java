package com.learning.java.practice.time;

import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by krvh271 on 12/6/17.
 */
public class OffsetTime {
    public static void main(String arg[]){
        System.out.println(new Date().getTimezoneOffset());
        Timestamp timestamp=new Timestamp(System.currentTimeMillis());
        System.out.println(timestamp);
    }
}
