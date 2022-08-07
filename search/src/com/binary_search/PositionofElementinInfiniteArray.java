package com.binary_search;

//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/


public class PositionofElementinInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(positionOfElementinInfiniteArray(arr, target));
    }

    public static  int positionOfElementinInfiniteArray(int[] arr, int target){
        int start = 0;
        int end = 1;

       //double size of box while target is greater than target
        while(target > arr[end]){
            int newStart = end + 1;
           // new end = privious end + sizeofbox *2;
            end = end + (end - start + 1)*2;
            start = newStart;
        }
        return binarySearch(arr, target, start, end);
    }

    public static int binarySearch(int[] nums, int target, int start, int end){

        while (start <= end){
            int mid = start + (end - start)/2;
            if(target == nums[mid]){
                return mid;
            }
            else if(target < nums[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
