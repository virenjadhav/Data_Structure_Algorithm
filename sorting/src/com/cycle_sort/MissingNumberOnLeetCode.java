package com.cycle_sort;

//https://leetcode.com/problems/missing-number/

public class MissingNumberOnLeetCode {
    public static void main(String[] args) {
        int[] nums = {3, 2, 0, 1};
        System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correctIndex = nums[i];
            if(nums[i] < nums.length && nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex);
            }
            else {
                i++;
            }
        }
        //Search for first missing number
        for(int index= 0; index < nums.length; index++){
            if(nums[index] != index){
                return index;
            }
        }
        //Case 2 if array is sorted so return the length of array
        return nums.length;
    }

    public static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

}
