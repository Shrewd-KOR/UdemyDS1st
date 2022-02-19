package com.gmm.ds.sec4.array.qn;

public class TrappedRainProblem {

    // O(N) running time(with additional O(N) memory complexity)
    public int solve(int[] heights){

        // 바가 3개 미만이면 불가능
        if(heights.length < 3)
            return 0;

        // create array for the max left and right values
        int [] leftMax = new int[heights.length];
        int [] rightMax = new int[heights.length];

        leftMax[0] = 0;
        for(int i=1; i<leftMax.length; i++){
            leftMax[i] = Math.max(leftMax[i-1], heights[i-1]);
        }

        rightMax[rightMax.length-1]=0;
        for(int i=rightMax.length-2; i>= 0; i--){
            rightMax[i] = Math.max(rightMax[i+1], heights[i+1]);
        }

        // consider all the items in O(N) running time
        int trapped = 0;
        for(int i=1; i<heights.length-1; i++)
        {
            if(Math.min(leftMax[i],rightMax[i]) > heights[i]){
                trapped += Math.min(leftMax[i],rightMax[i]) - heights[i];
            }
        }

        return trapped;
    }
}
