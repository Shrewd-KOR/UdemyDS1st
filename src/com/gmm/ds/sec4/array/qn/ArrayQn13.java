package com.gmm.ds.sec4.array.qn;

import java.util.Arrays;

public class ArrayQn13 {
    public static void main(String[] args) {

       if(anagram("restful".toCharArray(), "fluster".toCharArray()))
           System.out.println("Anagram!");
       else
           System.out.println("No Anagram!");
    }

    private static boolean anagram(char[] a, char[] b) {
        if (a.length != b.length)
           return false;

        // sort the letters of the strings
        // O(NlogN) this is the 'bottleneck' of the algorithm
        Arrays.sort(a);
        Arrays.sort(b);

        // consider all the letters one by one, compare
        // O(N) but the overall running time is O(NlogN) + O(N) = O(NlogN)
        for (int i=0; i<a.length; i++)
        {
            if(a[i]!=b[i])
                return false;
        }

        return true;
    }
}
