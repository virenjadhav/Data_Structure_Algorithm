package com.Operator;

public class AndOperatorOddOrEven {

    public static void main(String[] args) {
	    int a = 21;
        System.out.println(isOdd(a));
    }

    private static boolean isOdd(int a) {
        return (a & 1) == 1;
    }
}
