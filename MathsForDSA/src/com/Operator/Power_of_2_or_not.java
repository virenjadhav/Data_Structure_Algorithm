package com.Operator;

public class Power_of_2_or_not {
    public static void main(String[] args) {
//        int n = 0; // output : 0 which is not a power of 2  // note: fix for n = 0 and 1
        int n = 16;
        boolean ans = (n & (n - 1)) == 0;

        System.out.println(ans);
    }
}
