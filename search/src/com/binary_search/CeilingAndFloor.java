package com.binary_search;

public class CeilingAndFloor {

     public  int ceilingOfANumber(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        if(target > arr[arr.length-1]){
            return -1;
        }

        while (start <= end){
            int mid = start + (end - start)/2;

            if (target == arr[mid]) {
                return mid;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return start;
    }
    public int floorOfANumber(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;



        while (start <= end){
            int mid = start + (end - start)/2;

            if (target == arr[mid]) {
                return mid;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return end;
    }
}
