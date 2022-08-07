package com.twoPointers;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
        System.out.println(Arrays.toString(s));
    }

    //first Approach
//    static public void reverseString(char[] s) {
//            for(int i =0; i< (s.length - 1 )/2; i++){
//                char c = s[i];
//                s[i] = s[s.length - 1 - i];
//                s[s.length - 1 - i ] = c;
//            }
//        }

    //2nd Approach
    static public void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;
        while(start <= end){
            swap(s, start, end);
            start++;
            end--;
        }
    }

    private static void swap(char[] s, int start, int end) {
        char c = s[start];
        s[start] = s[end];
        s[end] = c;
    }

}
