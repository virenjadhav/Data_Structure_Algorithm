package com.cycle_sort;

// https://leetcode.com/problems/find-the-duplicate-number/

public class Find_the_Duplicate_Number {

    public static void main(String[] args) {
        int[] arr = {1,3,4,4,2};
        System.out.println(findDuplicate(arr));
    }

    static  public int findDuplicate(int[] arr) {
        int i = 0;
        while(i < arr.length){
            // int correctIndex = arr[i] - 1;
            // if (arr[i] != arr[correctIndex]) {
            //     swap(arr, i, correctIndex);
            // }
            // else if(arr[i] != i+1){
            //     return arr[i];
            // }
            // else{
            //     i++;
            // }



            if(arr[i] != i+1){
                int correctIndex = arr[i] - 1;
                if (arr[i] != arr[correctIndex]) {
                    swap(arr, i, correctIndex);
                }else{
                    return arr[i];
                }
            }else{
                i++;
            }

        }

        return -1;
    }

     static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
