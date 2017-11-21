package com.learning.java.practice.logical;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by krvh271 on 11/12/17.
 */
public class Anagrams {
    public static void main(String arg[]) {
        System.out.println(isAnagram("hellow", "hellow"));

    }

    static boolean isAnagram(String a, String b) {
        Map<String, Integer> hmAstr = getCharCountMap(a.toLowerCase());
        Map<String, Integer> hmBstr = getCharCountMap(b);

        if (hmAstr.keySet().size() == hmBstr.keySet().size()) {
            for (String str : hmAstr.keySet()) {
                if (!hmAstr.get(str).equals(hmBstr.get(str))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    static Map<String, Integer> getCharCountMap(String a) {
        Map<String, Integer> hm = new HashMap();
        String strArray[] = a.split("");
        for (String str : strArray) {
            if (hm.get(str) != null) {
                hm.put(str, hm.get(str) + 1);
            } else {
                hm.put(str, new Integer(1));
            }
        }
        return hm;
    }
}
