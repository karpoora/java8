package com.learning.java.practice.string;


import java.util.Arrays;

/**
 * Created by krvh271 on 10/10/17.
 */
public class ReverseWordImpl {
    public static void main(String[] args) {
        String str="pandian";
        System.out.println(reverseStr(str));
        System.out.println(reverseChar(str));
    }

    private static String reverseStr(String str) {
        String tempArray[]=new String[str.length()];
        int i=0;
        for(String s:str.split("")){
            tempArray[str.length()-1-i]=s;
            i++;
        }
        return Arrays.toString(tempArray);
    }

    private static String reverseChar(String str) {
        char tempArray[]=str.toCharArray();
        char reverseArray[]=new char[tempArray.length];
        for(int i=tempArray.length-1,j=0;i>=0;i--,j++){
            reverseArray[j]=tempArray[i];
        }
        return new String(reverseArray) ;
    }
}
