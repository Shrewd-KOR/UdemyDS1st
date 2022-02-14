package com.gmm.ds.sec4.array.qn;

public class ArrayQn17 {
    public static void main(String[] args) {

        System.out.println(integerReverse(1234569));
    }

    private static int integerReverse(int num) {

        int reversed = 0;
        int remainder = 0;
        while(num > 0){
            remainder = num % 10;  //10으로 나눈 나머지(1의자리 수)
            num = num / 10;        //10으로 나눈 몫 (1의자리 수 제거)
            reversed = reversed * 10 + remainder; // 기존값*10(자리수키우고) + 10으로 나눈 나머지
        }
        return reversed;
    }
}
