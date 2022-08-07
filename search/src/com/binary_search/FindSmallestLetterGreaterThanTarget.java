package com.binary_search;

//https://leetcode.com/problems/find-smallest-letter-greater-than-target/

public class FindSmallestLetterGreaterThanTarget {
    public char nextGreatestLetter(char[] arr, char target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start)/2;
            if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return arr[start % arr.length];
    }
}
