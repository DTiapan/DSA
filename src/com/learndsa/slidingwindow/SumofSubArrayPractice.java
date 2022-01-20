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
public class SumofSubArrayPractice {
    public static void main(String[] args) {
        int arr[] = {1, 4, 2, 10, 23, 3, 1, 0, 20};
        int k = 4;
        System.out.println(printMaxSum(arr, k));
    }

    private static int printMaxSum(int[] arr, int k) {
        int i =0;
        int j=0;
        int sum=0;
        int maxSum =0;
        //base condition check
        if(k > arr.length) {
            System.out.println("Window size is bigger than array");
            return -1;
        }

        while (j < arr.length) {
            sum = sum + arr[j];
            if(j-i+1<k) {
                j++;
            } else if (j-i+1 == k) {
                maxSum = max(sum, maxSum);
                sum = sum - arr[i];
                j++;
                i++;
            }
        }

        return maxSum;
    }
}
