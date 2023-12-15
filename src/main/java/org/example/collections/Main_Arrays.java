package org.example.collections;

import java.util.ArrayList;
import java.util.List;
//With arrays, we map indices to values.

public class Main_Arrays {
    public static void main(String[] args) {
        Arrays arrs = new Arrays();
        System.out.println(arrs.toString()); //Arrays{j=0, k=1000, arr=[1, 2, 3], nestedArr=[[I@4617c264, [I@36baf30c]}
        System.out.println(arrs.j = 33); // 33 value can be changed from 1 instance to another
        System.out.println(Arrays.i); // 5 same value for all instances of class
        Arrays.staticMethod(); // i=7

        //Index 0,1,2 length is fixed -static, part of Java core, multidimensional,
        // supports primitives, objects, length(capacity)
        String [] strArray = new String[] {"A","B","C"};
        Integer [] intArray = new Integer[3]; // init size
        strArray[1] = "Y";
        for (Integer i: intArray) {
            System.out.println(i = 33); //33 33 33
        }
        for (String s: strArray) {
            System.out.println(s); // A Y C
        }

        //ArrayList length is dynamic, you can resize, change, insert/delete,
        // its part of Collection framework, one dimensional, supports object, size()
        List<String> fruits = new ArrayList<>();
        fruits.add("North");
        fruits.add("South");
        fruits.add("West");
        fruits.add(0, "North-West");

        for (String s: fruits) {
            System.out.println(s); // North-West   North  South  West
        }






    }
}
