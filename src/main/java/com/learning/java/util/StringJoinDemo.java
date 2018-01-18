package com.learning.java.util;

import java.math.BigDecimal;
import java.util.StringJoiner;

/**
 * Created by krvh271 on 10/20/17.
 */
public class StringJoinDemo {

    public static void main(String args[]) {
        StringJoinDemo joinObject = new StringJoinDemo();
        joinObject.method1();
        joinObject.bigDecimalMax();
    }

    void method1() {
        StringJoiner joiner = new StringJoiner(",");
        System.out.println(joiner.length());
        joiner.add("test1");
        joiner.add("test2");
        joiner.add("test3");
        joiner.add("test4");

        System.out.println(joiner.length());
        System.out.println(joiner.toString());

    }

    void bigDecimalMax(){
        BigDecimal bbb=new BigDecimal(66);
        BigDecimal ccc=new BigDecimal(77);

        System.out.println(bbb.max(ccc));
    }
}
