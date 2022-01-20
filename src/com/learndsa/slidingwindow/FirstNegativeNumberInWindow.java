package com.learndsa.slidingwindow;

import java.util.ArrayList;

/**
 * Given an array and a positive integer k, find the first negative integer for each window(contiguous subarray) of size k.
 * If a window does not contain a negative integer, then print 0 for that window.
 * Examples:
 * Input : arr[] = {-8, 2, 3, -6, 10}, k = 2
 * Output : -8 0 -6 -6
 * First negative integer for each window of size k
 * {-8, 2} = -8
 * {2, 3} = 0 (does not contain a negative integer)
 * {3, -6} = -6
 * {-6, 10} = -6
 *
 * Input : arr[] = {12, -1, -7, 8, -15, 30, 16, 28} , k = 3
 * Output : -1 -1 -7 -15 -15 0
 * */
public class FirstNegativeNumberInWindow {
    public static void main(String[] args) {
        int arr[] = {12, -1, -7, 8, -15, 30, 16, 28};
        int windowsize = 3;
        printfirstNegativeNumber(arr, windowsize);
    }

    private static void printfirstNegativeNumber(int[] arr, int windowsize) {
        int firstptr =0;
        int endptr = 0;
        //base condition check
        ArrayList<Integer> arrayList = new ArrayList<>();
        if( windowsize > arr.length) {
            System.out.println("Window size is greater than array");
            return;
        }

        while (endptr < arr.length) {
            if(arr[endptr] < 0) {
                arrayList.add(arr[endptr]);
            }
            if(endptr - firstptr + 1 < windowsize) {
                endptr++;
            } else if(endptr - firstptr + 1 == windowsize) {
                if(arrayList.isEmpty()) {
                    System.out.print("0 ");
                } else {
                    System.out.print(arrayList.get(0)+" ");
                    if(arrayList.contains(arr[firstptr])) {
                        arrayList.remove(0);
                    }
                }

                endptr++;
                firstptr++;
            }
        }


    }
}
