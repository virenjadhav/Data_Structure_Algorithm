package com.Operator;

public class Find_ith_bit_of_that_number {
    public static void main(String[] args) {
        int number = 182;
        int n = 5;
        System.out.println(ith_bit(number, n));
    }

    private static int ith_bit(int number, int n) {
        return number & (1 << (n-1));
    }
}
