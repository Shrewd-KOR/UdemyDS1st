package com.gmm.ds.sec4.array.qn;

public class ArrayQn11 {
    public static void main(String[] args) {

        int[] T = {1, 2, 3, 4, 5};

        int startindex = 0;
        int endindex = T.length-1;

        while(startindex < endindex){
            swap(T,startindex,endindex);
            startindex++;
            endindex--;
        }

        for( int nums : T)
            System.out.println(nums);
    }

    private static void swap(int[] array, int a, int b){
        int temp = array[b];
        array[b] = array[a];
        array[a] = temp;

    }
}
