package com.learndsa.miscproblems;
//using while loops
public class MergeSortedArrays {

    public static void main(String[] args) {
        int arr1[] = new int[]{5, 7, 55, 88, 99};
        int arr2[] = new int[]{3, 6, 11, 15, 21};
        printmergedArray(arr1, arr2);
    }

    public static void printmergedArray(int arr1[], int arr2[]) {
        int mergedArray[] = new int[arr1.length + arr2.length];

        int i=0, j=0, k=0;
        //check input
        if(arr1.length == 0) {
            printArray(arr2);
        }
        //check input
        if(arr2.length == 0) {
            printArray(arr1);
        }

        while(i<arr1.length && j<arr2.length) {
            if(arr1[i] > arr2[j]) {
                mergedArray[k++] = arr2[j++];
            } else {
                mergedArray[k++] = arr1[i++];
            }
        }

        while(i<arr1.length) {
            mergedArray[k++] = arr1[i++];
        }

        while(j<arr2.length) {
            mergedArray[k++] = arr2[j++];
        }

        printArray(mergedArray);

    }

    public static void printArray(int arr[]) {
        for(int i : arr) {
            System.out.print(i+" ");
        }
    }
}
