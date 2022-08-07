package com.PrimeNo;

public class PrimeNoUptoNumberN {
    public static void main(String[] args) {
        int n = 40;
        boolean[] notPrimes  = new boolean[n + 1]; // By default values is false;
        sieveOfEratosthenes(n, notPrimes);
    }
    static  void sieveOfEratosthenes(int n , boolean[] notPrimes){
        for (int i = 2; i * i <= n; i++) {
            if(!notPrimes[i]){
                for (int j = i * 2; j <= n; j+= i) {
                    notPrimes[j] = true;
                }
            }
        }
        for (int i = 2; i <= n ; i++) {
            if(!notPrimes[i]){
                System.out.print(i + " ");
            }
        }
    }
}
