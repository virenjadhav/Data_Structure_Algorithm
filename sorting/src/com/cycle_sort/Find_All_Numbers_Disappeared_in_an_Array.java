package com.cycle_sort;

// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/submissions/

import java.util.*;



public class Find_All_Numbers_Disappeared_in_an_Array {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        cyclicSort(nums);
        System.out.println(findDisappearedNumbers(nums));

    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list=new ArrayList<Integer>();
        for(int index = 0; index < nums.length; index++){
            if(nums[index] != index +1){
                list.add(index+1);
            }
        }
        return list;

    }
    public static void cyclicSort(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correctIndex = arr[i] -1;
            if(arr[i] != arr[correctIndex]){
                swap(arr, i, correctIndex);
            }
            else {
                i++;
            }
        }

//        return arr;
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
