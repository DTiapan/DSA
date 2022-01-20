package com.learndsa.leetcode.arrays;

import java.util.Arrays;

public class findMissingNumber {
    public static void main(String[] args) {
        int arr[] = {4,5,3,1,2,7, 6, 9};
        System.out.println(printMissingNumber(arr));
    }

    private static int printMissingNumber(int[] arr) {
        SortArry(arr);
        for(int i=0; i<arr.length; i++) {
            if(arr[i] != (arr[i]+1)) {
                return arr[i] + 1;
            }
        }
        return arr.length;
    }

    private static int[] SortArry(int[] arr) {
        int index=0;
        while (index < arr.length) {
            int value = index + 1 ;
            if(arr[index] != value) {
                //System.out.println("Swap : "+arr[index]+" and "+(arr[arr[index]-1]));
                Swap(arr, index, arr[index]-1);
            } else {
                index++;
            }
        }
        return arr;
    }

    private static void Swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
