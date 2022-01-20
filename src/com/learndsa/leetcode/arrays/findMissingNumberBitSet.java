package com.learndsa.leetcode.arrays;

import java.util.Arrays;
import java.util.BitSet;

public class findMissingNumberBitSet {
    public static void main(String[] args) {
        int arr[] = {3, 4, -1, 1};
        printMissingNumber(arr, 1);
    }

    private static void printMissingNumber(int[] arr, int sizeOfOriginalArray) {
        int missingCount = sizeOfOriginalArray - arr.length;
        BitSet bs = new BitSet(sizeOfOriginalArray);

        //populate bitset with arr
        Arrays.stream(arr).forEach(i -> bs.set(i-1));
      /*  for(int i: arr) {
            bs.set(i-1); //we are setting bitindex, hence it is i-1
        }*/

        int missingCountIndex = 0;

        for(int i=0; i<missingCount; i++) {
            missingCountIndex = bs.nextClearBit(missingCountIndex);
            System.out.println(++missingCountIndex);
        }
    }
}
