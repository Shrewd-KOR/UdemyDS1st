package com.gmm.ds.sec4.array.qn;

import java.util.Arrays;

public class DutchFlagProblem {

    private int[] nums;

    public DutchFlagProblem(int[] nums) {
        this.nums = nums;
    }

    public void solve(){
        int i = 0;
        int j = 0;
        int pivot = 1;
        int k = nums.length - 1;

        // O(N) linear running time
        while (j<=k){
            if(nums[j] < pivot){  // when j = 0
                swap(i,j);
                i++;
                j++;
            }
            else if (nums[j] > pivot){ // when j = 2
                swap(j,k);
                k--;
            }
            else { // when j = 1
                j++;
            }
        }
    }

    private void swap(int index1, int index2){
        int temp = nums[index1];
        nums[index1]=nums[index2];
        nums[index2]=temp;

    }

    public void showResult(){
        System.out.println(Arrays.toString(nums));
    }
}

/*
    Dutch National Flag Problem proposed by Edsger Dijkstra

    The Dutch National flag contains 3 colors (0, 1, 2)
    array of integers (0,1,2). sort this array in line running time using constant memory

    [Sudo code]

    procedure three-way-partition(A: array of values, mid: value):
       i <- 0
       j <- 0
       k <- size of A - 1

       while j<=k:
          if A[j] < mid:
             swap A[i], A[j]
             i <- i + 1
             j <- j + 1
          else if A[j] > mid:
             swap A[j], A[k]
             k <- k - 1
          else:
             j <- j + 1

     mid: 1
     i: 좌측부터 정렬되지않은 Index(Swap의 대상이 되는 Index)
     j: 현재 체크중인 Value Index
     k: 우측부터 정렬되지않은 Index(Swap의 대상이 되는 Index)


 */