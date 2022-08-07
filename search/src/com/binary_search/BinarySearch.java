package com.binary_search;

//import CeilingAndFloor;

//import java.util.concurrent.Callable;

public class BinarySearch {

    public static void main(String[] args) {
	// write your code here
//        System.out.println("Binary Search");
        int[] arr = {2,3, 4, 5,7 , 8 , 23, 34, 56, 88,99};
        int target = 23;
        System.out.println(BinarySearch(arr, target));
        CeilingAndFloor clf = new CeilingAndFloor();
        System.out.println(clf.ceilingOfANumber(arr, target=20));
        System.out.println(clf.floorOfANumber(arr, target=24));

    }
    static int BinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                end = mid-1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }

}
