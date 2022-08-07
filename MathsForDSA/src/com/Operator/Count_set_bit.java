package com.Operator;

public class Count_set_bit {
    public static void main(String[] args) {
        int n = 234567;

        System.out.println(Integer.toBinaryString(n));

        System.out.println(setBits(n));

    }

    private static int setBits(int n) {
        int count = 0;

//         1st Approach
//        while (n > 0){
//            count++;
//            n -= (n & -n);
//        }
//        2nd Approach
        while(n > 0){
            count++;
            n = (n & n-1);
        }
        return count;
    }
}
