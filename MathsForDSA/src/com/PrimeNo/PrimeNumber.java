package com.PrimeNo;

public class PrimeNumber {
    public static void main(String[] args) {
        int n = 40;
//        if(isPrime(n)){
//            System.out.println("Number is Prime");
//        }
//        else{
//            System.out.println("Number is not Prime");
//        }
        for (int i = 1; i <= n; i++) {
            System.out.println(i + "  : " + isPrime(i));
        }
    }
    static public boolean isPrime(int n){

        if(n <= 1){
            return false;
        }
        // basic way or brute force
//        for (int i = 2; i < n; i++) {
//            if( n % i == 0) return false;
//        }
//        return true;
//

        // Optimize way
        for (int i = 2; i * i <= n; i++) {
            if( n % i == 0) return false;
        }
        return true;
    }
}
