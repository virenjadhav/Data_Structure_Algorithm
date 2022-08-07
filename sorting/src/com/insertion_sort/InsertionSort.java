package com.insertion_sort;

import java.util.Arrays;
import java.util.Random;

public class InsertionSort {
//        public static void main(String[] args) {
//	int[] arr = {5, 4, 3, 2, 1};
//    insertionSort(arr);
//    System.out.println(Arrays.toString(arr));
//    }

    public static void main(String[] args) {
//        int[] arr = {99, 54, 43, 67, 76, 22, 54, 66, 21, 1, 14, 20};
        int[] arr = new int[1000];
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            arr[i] = random.nextInt(1000);
        }
        insertionSort(arr);
//        System.out.println(Arrays.toString(arr));
        for (int j = 0; j < 1000; j++) {
            System.out.print(arr[j]+" ");
            if(j%10 == 0) System.out.println();
        }
    }

    static public void insertionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j > 0; j--) {
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }
                else{
                    break;
                }
            }
        }
    }

     static public void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] =  arr[second];
        arr[second] = temp;
    }
}
