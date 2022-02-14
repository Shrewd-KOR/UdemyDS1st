package com.gmm.ds.sec4.array.qn;

public class ArrayQn15 {
    public static void main(String[] args) {

        if(palindrom("radar".toCharArray()))
            System.out.println("Palindrome!");
        else
            System.out.println("NOOOOOOOOOOP");
    }

    // O(N) linear running time complexity
    private static boolean palindrom(char[] str) {

        int startindex =0;
        int endindex = str.length-1;

        while(startindex<endindex){
            if(str[startindex] != str[endindex])
                return false;

            startindex++;
            endindex--;
        }
        return true;

    }
}
