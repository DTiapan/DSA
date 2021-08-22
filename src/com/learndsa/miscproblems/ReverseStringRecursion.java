package com.learndsa.miscproblems;

public class ReverseStringRecursion {

    public static void main(String[] args) {
        System.out.println(returnReseversedString("Ajas"));
    }

    public static String returnReseversedString(String mystr) {
        if(mystr.length() == 0) {
            return "";
        }
        return returnReseversedString(mystr.substring(1)) + mystr.charAt(0);
    }
}
