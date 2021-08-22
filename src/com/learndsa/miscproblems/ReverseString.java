package com.learndsa.miscproblems;

/**
 * Problem name :  Reverse a string
 * Approach     : Brute force
 * Time Complexity : O(n)
 * Space Complexity : O(n)
 */
public class ReverseString {

    public static void main(String[] args) {
       System.out.println(printReversedString("Ajas"));
    }

   public static String printReversedString(String mystr) {
        // Step 1 :  Checks - if passed parameter is string or length > 2
        if(mystr.length() < 2) {
            return mystr;
        }
       /* } else if (mystr.getClass() != "java.lang.String".toString()) {
            return "not a valid input";
        }*/
        String reversedString="";

        for(int i = mystr.length()-1; i >= 0; i--) {

            reversedString += mystr.charAt(i);
        }
       return reversedString;
   }
}
