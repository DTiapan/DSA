package com.learndsa.slidingwindow;

import static java.lang.Math.max;

/**
 * find maximum sum of a subarray of size k
 * Input  : arr[] = {100, 200, 300, 400}
 *          k = 2
 * Output : 700
 *
 * Input  : arr[] = {1, 4, 2, 10, 23, 3, 1, 0, 20}
 *          k = 4
 * Output : 39
 * We get maximum sum by adding subarray {4, 2, 10, 23}
 * of size 4.
 *
 * Input  : arr[] = {2, 3}
 *          k = 3
 * Output : Invalid
 * There is no subarray of size 3 as size of whole
 * array is 2.
 */
public class SumOfSubArray {
    public static void main(String[] args) {
        int arr[] = {2, 3};
        int windowsize = 3;
        System.out.println(printMax(arr, windowsize));
    }

    private static int printMax(int[] arr, int windowsize) {
        int i = 0;
        int j = 0;
        int sum = 0;
        int maxSum = 0;
        if(windowsize > arr.length) {
            System.out.println("Invalid");
            return -1;
        }
        while(j < arr.length) {
            sum = sum + arr[j];
            if(j-i+1 < windowsize) {
                j++;
            } else if (j-i+1 == windowsize) {
                maxSum = max(maxSum, sum);
                sum = sum - arr[i];
                i++;
                j++;
            }
        }
        System.out.println("Max sum is: "+maxSum);
        return maxSum;
    }


}
