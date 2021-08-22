package com.learndsa.miscproblems;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * [2, 1, 1, 3, 4, 5, 6]
 * Ans :  1
 */
public class firstRecurringCharacter {
    public static void main(String[] args) {
     //check Input
     int arr[] = new int[]{2, 78, 8, 78, 99, 5, 6};

     System.out.println(printFirstRecurringChar(arr));

    }

    public static String printFirstRecurringChar(int[] arr) {
        Map<Integer, Integer> mp =  new HashMap<>();

        for(int i=0; i<arr.length; i++) {

            if(mp.containsKey(arr[i])) {

                return "First recurring char found "+arr[i];
            }
            mp.put(arr[i], 1);
        }
        return "not found";
    }
}
