package com.twoPointers;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Let's take LeetCode contest");
        System.out.println(reverseWords(s));
    }
    static public StringBuilder reverseWords(StringBuilder s) {
        int start = 0;
        int end = -1;
        int length = s.length() - 1;

        while(true){
            end = findEnd(s, start);
            s = reverseWord(s, start, end);

            if(end == length) break;
            start = end +2;
        }
        return s;
    }

    private static int findEnd(StringBuilder s, int start) {
        int end = start;
        int length = s.length() - 1;
        while(end <= length){
            if(end == length) {
                return end;
            }
            else if(s.charAt(end) == ' '){
                return end - 1;
            }
            else {
                end++;
            }
        }
        return -1;
    }

    static public StringBuilder reverseWord(StringBuilder s, int start, int end){
        int st = start;
        int e = end;
        while(st < e){
            s = swap(s, st, e);
            st++;
            e--;
        }

        return s;
    }
    private static StringBuilder swap(StringBuilder s, int start, int end) {
        char c = s.charAt(start);
//        s.charAt(start) = s.charAt(end);
        s.setCharAt(start,s.charAt(end));
        s.setCharAt(end, c);
        return s;
    }
}
