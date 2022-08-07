package com.selection_sort;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {
    public static void main(String[] args) {
//        int[] arr = {99, 54, 43, 67, 76, 22, 54, 66, 21, 1, 14, 20};
        int[] arr = new int[1000];
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            arr[i] = random.nextInt(1000);
        }
        selectionSort(arr);
//        System.out.println(Arrays.toString(arr));
        for (int j = 0; j < 1000; j++) {
            System.out.print(arr[j]+" ");
            if(j%10 == 0) System.out.println();
        }
    }

    static public void selectionSort(int[] arr){
        //Selection sort with select maximum value then fixed on correct position
//        selectionSortWithMax(arr);
        //Selection sort with select minimum value then fixed on correct position
        selectionSortWithMin(arr);
    }
    static public void selectionSortWithMin(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = getMinIndex(arr, i, arr.length-1);
            swap(arr, minIndex, i);
        }
    }
    static public void selectionSortWithMax(int[] arr){
        for (int i = 0; i < arr.length -1; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, last, maxIndex);
        }
    }
    static public void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static public int getMaxIndex(int[] arr, int start, int end){
        int max = start;
        for (int i = start; i <= end ; i++) {
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
    static public int getMinIndex(int[] arr, int start, int end){
        int min = start;
        for (int i = start; i <= end; i++) {
            if(arr[min] > arr[i]){
                min = i;
            }
        }
        return min;
    }
}
