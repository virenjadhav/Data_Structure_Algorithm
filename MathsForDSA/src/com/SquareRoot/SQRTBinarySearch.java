package com.SquareRoot;

public class SQRTBinarySearch {
    public static void main(String[] args) {
        int n = 40000000;
        int precision = 3;

        System.out.println(sqrt(n, precision));
    }

    private static double sqrt(int n, int precision) {

        double root = 0.0;

//        root = BinarySearch(n);

        root = squareMethod(n);

        double incr = 0.1;
        for (int i = 0; i < precision; i++) {

            while(root * root <= n){
                root = root +  incr;
            }
            root -= incr;
            incr /= 10;


        }
        return root;
    }
    static public double BinarySearch(int n){
        int start = 0;
        int end = n;

        while ( start <= end){
            int mid = start + (end - start) / 2;
            if (mid * mid == n){
                return mid;
            }
            else if (mid * mid > n){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }

        }
        return end;
    }
    static public double squareMethod(int n){
        int i = 0;
        while (i * i <= n){
            i++;
        }
        return i - 1;
    }
}


