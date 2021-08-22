package com.learndsa.miscproblems;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//for this we can utilize hasMap for constant lookup
public class sumOfTwoNums_Optimized {
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 4};
        int sum = 8;
        int complimentArray[] = new int[arr.length];

        for (int i=0; i<arr.length; i++) {
            complimentArray[i] = sum - arr[i];
        }
        for ( int k  : complimentArray ) {
            System.out.println("comp "+k);
        }
        for(int j=0; j<complimentArray.length; j++) {
            if(complimentArray[j]==arr[j]) {
                System.out.println("sum pair exists");
            } else {
                System.out.println("sum pair does not exists");
            }
        }




    }


}
