package com.learndsa.miscproblems;

/*public class com.learndsa.miscproblems.findNextPrimeNmber {


    public static void main(String[] args) {
        findNextPrime(5);
    }

    private static void findNextPrime(int num) {
        int to = Integer.MAX_VALUE;
        int count = 0;
        for(int i=num; i < to; i++) {
            if(checkIfPrime(i)) {
                if(++count == 2) {
                    System.out.println("Next Prime is :"+i);
                    break;
                }
            }
        }
    }

    private static boolean checkIfPrime(int num) {
        boolean isPrime = true;

        for (int i = 2; i < num; i++) {
            int temp = num % i;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;

    }
}
*/
class findNextPrimeNmber {
    public static void main(String[] args) {
        System.out.println(nextPrime(3));
    }

    public static int nextPrime(int input){
        int counter;
        input++;
        while(true){
            //int l = (int) sqrt(input);
            counter = 0;
            for(int i = 2; i <= input/2; i ++){
                if(input % i == 0)  counter++;
            }
            if(counter == 0)
                return input;
            else{
                input++;
                continue;
            }
        }
    }
}
