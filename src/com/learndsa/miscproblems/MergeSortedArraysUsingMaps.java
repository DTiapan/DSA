package com.learndsa.miscproblems;

import java.util.HashMap;
import java.util.Map;

public class MergeSortedArraysUsingMaps {
    public static void main(String[] args) {
        int arr1[] = new int[]{5, 7, 55, 88, 99};
        int arr2[] = new int[]{3, 6, 11, 15, 21};
        printMergedArray(arr1, arr2);
    }

    public static void printMergedArray(int arr1[], int arr2[]) {
        Map<Integer, Boolean> map1 = new HashMap<>();

        for(int i : arr1) {
            map1.put(i, true);
        }

        for(int i : arr2) {
            map1.put(i, true);
        }

       /* for(int k : map1.keySet()) {
            System.out.print(k+" ");
        }*/

        for(Map.Entry<Integer,Boolean> me : map1.entrySet()) {
            System.out.print(me.getKey() + " ");
        }


    }
}
