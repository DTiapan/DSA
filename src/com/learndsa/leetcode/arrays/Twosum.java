package com.learndsa.leetcode.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/two-sum/description/
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Output: Because nums[0] + nums[1] == 9, we return [0, 1].
 */


public class Twosum {
    public static void main(String[] args) {
        int nums[] = new int[]{3,2,4};
        int target = 6;
        printArray(printTwoSumIndices(nums, target));
    }

    public static int[] printTwoSumIndices(int[] arr, int target) {

        Map<Integer, Integer> mp = new HashMap<>();

        for(int i=0; i<arr.length; i++) {
            if(mp.containsKey(target - arr[i])){
                return new int[] {mp.get(target - arr[i]), i};
            }
            mp.put(arr[i], i);
        }

        throw new IllegalArgumentException("no match found");
    }

    public static void printArray(int arr[]) {
        for(int i : arr) {
            System.out.print(i+" ");
        }
    }
}
