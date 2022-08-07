package com.binary_search;

//https://leetcode.com/problems/peak-index-in-a-mountain-array/submissions/

public class PeakIndexinaMountainArray {

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1};
        System.out.println(peakIndexInMountainArray(arr));
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start)/2;

            if(arr[mid] > arr[mid+1]){
                //because end will maybe the ans thats why end != mid-1
                end = mid;
            }
            else{
                start = mid + 1;
            }
        }
        return start; //we return both start and end because they are same at last

    }
}
