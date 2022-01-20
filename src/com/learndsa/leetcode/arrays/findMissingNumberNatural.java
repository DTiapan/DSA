package com.learndsa.leetcode.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class findMissingNumberNatural {
    public static void main(String[] args) {
        int arr[] = {4,5,3,1,2,7, 6, 9};
        System.out.println(IntStream.rangeClosed(1,9).sum() - Arrays.stream(arr).sum());
    }
}
