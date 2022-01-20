package com.learndsa.slidingwindow;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

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

public class FirstNegativeNumberInWindowQ {
    public static void main(String[] args) {
        int arr[] = {12, -1, -7, 8, -15, 30, 16, 28};
        int windowsize = 3;
        printfirstNegativeNumber(arr, windowsize);
    }

    private static void printfirstNegativeNumber(int[] arr, int windowsize) {
        int i=0;
        int j=0;
        Queue<Integer> q = new LinkedList<>();
        //base condition check
        if (windowsize > arr.length) {
            System.out.println("Invalid");
            return;
        }

        while(j < arr.length) {
            if(arr[j] < 0) {
                q.add(arr[j]);
            }
            if(j-i+1 < windowsize) {
                j++;
            } else if(j-i+1 == windowsize) {
                if(q.isEmpty()) {
                    System.out.print("0 ");
                } else {
                    System.out.print(q.peek()+" ");
                }
                if(q.contains(arr[i])) {
                    q.remove();
                }
                j++;
                i++;
            }
        }
    }
}
