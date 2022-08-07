package com.Operator;

// Calculate a^b

public class Power_of_any_number {
    public static void main(String[] args) {
        // example a^b = 3^6
        int base = 3;
        int power = 6;
        int ans = 1;

        while ( power > 0){
            if((power & 1) == 1){
                ans *= base;
            }

            base *= base;
            power = power >> 1;
        }

        System.out.println(ans);
    }
}
