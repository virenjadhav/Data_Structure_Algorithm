package com.cycle_sort;

// https://leetcode.com/problems/set-mismatch/


import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] nums = {8,7,3,5,3,6,1,4};
        System.out.println(Arrays.toString(findErrorNums(nums)));

    }
    static public int[] findErrorNums(int[] nums) {
        int i = 0;
        while(i < nums.length){

               int correctIndex = nums[i] - 1;
               if(nums[i] != nums[correctIndex]){
                   swap(nums, i, correctIndex);
               }

            else{
                i++;
            }
        }
        for(int index = 0; index < nums.length; index++){
            if(nums[index] != index+1){
                return new int[] {nums[index], index+1};
            }
        }
        return new int[] {-1,-1};
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
