package com.cycle_sort;

import java.util.Arrays;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = {1, 2,3 , 4};

//        System.out.println(Arrays.toString(arr));
        System.out.println(firstMissingPositive(arr));
    }

    static public int firstMissingPositive(int[] nums) {
        cyclicSort(nums);
        int index = 0;
        for(; index < nums.length; index++){
            if(nums[index] != index+1){
                return index+1;
            }
        }
        return index+1;
    }

    public static void cyclicSort(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correctIndex = arr[i] - 1;
            if((correctIndex >= 0 && correctIndex < arr.length) && arr[i] != arr[correctIndex]){
                swap(arr, i, correctIndex);
            }
            else{
                i++;
            }
        }
    }

//    public static void cyclicSort(int[] arr){
//        int i = 0;
//        while (i < arr.length){
//            int correctIndex = arr[i] - 1;
//            if((correctIndex >= 0 && correctIndex < arr.length)) {
//                if (arr[i] != arr[correctIndex]) {
//                    swap(arr, i, correctIndex);
//                }
//            }else {
//                i++;
//            }
//
//        }
//    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
