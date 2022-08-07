package com.string;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String name = "virendra jadhav";
        System.out.println(name.toCharArray());
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.compareTo("Vire"));
        System.out.println(name.compareToIgnoreCase("Vire"));
        System.out.println(name); // No change in String because this is immutable
        System.out.println(name.charAt(3));
        System.out.println(name.concat("HHHHHHHh"));
        System.out.println(name.indexOf("v"));
        System.out.println(name.trim());
        System.out.println(name.substring(0,3));
        System.out.println(name.startsWith("v"));

        System.out.println(Arrays.toString(name.split(" ")));



    }
}
