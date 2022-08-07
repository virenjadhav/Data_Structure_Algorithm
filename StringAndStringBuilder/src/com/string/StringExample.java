package com.string;

/*
Comparision of String:

1. == operator
(comparator)

--checks if ref variable to the same object.

--How to create diff. object of same value:
    String a = new String("virendra");
    String b = new String("virendra");
                // creating these values outside the pool but in heap

         Then a == b is give false.

2. When you only need to check value, use .equals method.
        a.equals(b)

 */


import java.util.ArrayList;

public class StringExample {

    public static void main(String[] args) {
	    // write your code here
        // Declaration
//            String name = "virendra jadhav";
    //        System.out.println(name);


    //        String a = "name";
    //        String b = "name";

    //        String a = new String("virendra");
    //        String b = new String("virendra");
    //        System.out.println(a == b);   // false
    //        System.out.println(a.equals(b));  // true


        // Formatted String

        float n = 1323.23232f;
//        System.out.printf("num is : %.2f", n);
//        System.out.printf("pi is : %.3f", Math.PI);

//        System.out.println('a' + 'b'); //195
//        System.out.println("a" + "b"); //ab
//        System.out.println('a' + 3); // 100
//        System.out.println((char)('a' + 3)); //d
//
//        System.out.println("a" + 1); //a1
//        System.out.println("virendra" + new ArrayList<>());//virendra[]



        //************************ Important ************************
//        System.out.println(new Integer(56) +  new ArrayList<>()); // This will give error because + operator will be use with only
//                                                                        // primitives or one of the element will be String
//        System.out.println(new Integer(56) + "" + new ArrayList<>()); // This will run fine because one element is String

//        System.out.println("a" + 'b'); // ab // one of the element is string then ans will be string



    }
}
