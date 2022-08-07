package com.Operator;

public class Reset_ith_bit_to_0 {
    public static void main(String[] args) {
        int number = 86;
        int n = 5;
        System.out.println(resetIthBit(number, n));
    }

    private static int resetIthBit(int number, int n) {
//        return number & (!(1<<(n-1)));
        return 0;
    }
}
