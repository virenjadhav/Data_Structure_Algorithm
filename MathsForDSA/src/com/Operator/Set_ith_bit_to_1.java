package com.Operator;

public class Set_ith_bit_to_1 {
    public static void main(String[] args) {
        int number = 86;
        int n = 4;
        System.out.println(setIthBit(number, n));
    }

    private static int setIthBit(int number, int n) {
        return number | (1 << (n-1));
    }
}
