package com.learning.java.practice.staticDemo;

/**
 * Created by krvh271 on 12/5/17.
 */
public class Child extends Parent {
    public static String name ="child";
    public static void method1(){
        System.out.println("in Child");
    }

    public static void main(String args[]){
        Parent p=new Child();
        p.method1();
        System.out.println(p.name);
    }
}
