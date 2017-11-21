package com.learning.java.practice.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by krvh271 on 10/10/17.
 */
public class SortMapByValueDemo {
    public static void main(String ars[]){
        Map<String,Integer> unsorted=new HashMap();
        unsorted.put("aaa",45);
        unsorted.put("bbb",60);
        unsorted.put("kkk",34);
        unsorted.put("ccc",29);
        unsorted.put("dd",1);
        unsorted.put("aasdfaa",6);
        unsorted.put("pkt",90);
        unsorted.put("rave",45);
        System.out.println(unsorted);

        unsorted=inBuiltSortedByKey(unsorted);
        System.out.println(unsorted);

        unsorted=sortedByKey(unsorted);
        System.out.println(unsorted);

        unsorted=sortedByValue(unsorted);
        System.out.println(unsorted);
    }

    private static Map<String,Integer> sortedByValue(Map<String, Integer> unsorted) {
        List<Map.Entry<String,Integer>> mapList=new ArrayList(unsorted.entrySet());
        LinkedHashMap<String,Integer> sortedMap=new LinkedHashMap<>();
        System.out.println(mapList);
        Collections.sort(mapList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        for(Map.Entry<String,Integer> e:mapList){
            sortedMap.put(e.getKey(),e.getValue());
        }
        return sortedMap;
    }

    private static Map<String, Integer> inBuiltSortedByKey(Map<String, Integer> unsorted) {
        return new TreeMap(unsorted);
    }


    private static LinkedHashMap<String,Integer> sortedByKey(Map<String, Integer> unsorted) {
        List<String> keys=new ArrayList(unsorted.keySet());
        Collections.sort(keys);
        LinkedHashMap<String,Integer> sortedByKey=new LinkedHashMap<>();
        for(String key:keys){
            sortedByKey.put(key,unsorted.get(key));
        }
        return sortedByKey;
    }

}
