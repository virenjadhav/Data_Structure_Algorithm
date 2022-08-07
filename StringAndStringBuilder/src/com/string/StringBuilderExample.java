package com.string;
/**
// *************************** IMPORTANAT **************************

When we create a new string variable and then modified again and again
 then string variable is created object in every time and reference variable is point to letest one.
 But this is more memory use of dereferenced variable
 so that's why we use
 "String Builder"

//******************************************************************

**/





public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            builder.append(ch);
        }

        builder.reverse();


        System.out.println(builder);
    }
}
