package com.Operator;

import org.w3c.dom.ls.LSOutput;

public class Xor_from_a_to_b {
    public static void main(String[] args) {
        // example a = 3 and b = 9
        // xor = 3^4^5^6^7^8^9 = 0^1^2^3^4^5^6^7^8^9 - 0^1^2
//        System.out.println(3^4^5^6^7^8^9);
//        System.out.println(0^1^2^3^4^5^6^7^8^9 - 0^1^2);
//        System.out.println(0^1^2^3^4^5^6^7^8^9 ^ 0^1^2);

        // range xor for a, b = xor(b) ^ xor(a-1)
        int a = 3;
        int b = 9;

        int ans = xor(b) ^ xor(a - 1);

        System.out.println(ans);

    }
    // this gives xor from 0 to a
    private static int xor(int a) {

        if(a % 4 == 0){
            return a;
        }
        else if(a % 4 == 1){
            return 1;
        }
        else if(a % 4 == 2){
            return a + 1;
        }
        else {
            return 0;
        }
    }
}
