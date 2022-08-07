package com.cycle_sort;

// When question is related to like 1 to N or given range then we use cyclic sort
// It is most efficient.
//we shift 3 to correct position 2 and 5 to correct position 4 and so on
// If any element in right position then move to element again check.
// Complexity : (n-1) for shifting element for correct position and
//                n for check correct value in right position
//                so hence :
//                complexity = (n-1) + n = 2n - 1
//                            so it is equal to O(n).

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void cyclicSort(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]){
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
