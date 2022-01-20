package com.learndsa.AlgoImplementation.Sorting;

import java.util.Arrays;

/**
 * A =      [4,5,3,1,2] =>
 * index    [0,1,2,3,4]
 * value    [1,2,3,4,5]
 *
 */
public class CyclicSort {
    public static void main(String[] args) {
        int arr[] = {4,5,3,1,2, 8, 7, 6, 9};
        System.out.println(Arrays.toString(printSortedArray(arr)));
    }

    private static int[] printSortedArray(int[] arr) {
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
