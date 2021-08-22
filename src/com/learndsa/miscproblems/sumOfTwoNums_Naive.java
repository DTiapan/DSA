package com.learndsa.miscproblems;

public class sumOfTwoNums_Naive {
    public static void main(String[] args) {
        int arr[] = {1, 3, 3, 4};

        for (int i=0; i <arr.length; i++) {
            for (int j=1; j<arr.length; j++) {
                if (arr[i] + arr[j] == 5) {
                    System.out.println("pair is "+arr[i]+" "+arr[j]);
                }
            }
        }
    }
}
