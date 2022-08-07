package com.cycle_sort;

//https://leetcode.com/problems/find-all-duplicates-in-an-array/

import java.util.*;

public class Find_All_Duplicates_in_an_Array {

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(nums));
    }

    static  public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();

        cyclicSort(nums);

        // find duplicate value in array
        for (int index = 0; index < nums.length; index++){
            if(nums[index] != index + 1){
                list.add(nums[index]);
            }
        }
        return list;
    }
    static public void cyclicSort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]){
                swap(arr, i, correctIndex);
            }
            else{
                i++;
            }
        }
    }

     static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
