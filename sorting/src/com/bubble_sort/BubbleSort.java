package com.bubble_sort;

// Bubble sort AKA sinking sort and exchange sort


import java.util.Arrays;
import java.util.Random;

public class BubbleSort {

//    public static void main(String[] args) {
//	int[] arr = {1, 2, 3, 4, 5};
//    bubbleSort(arr);
//    System.out.println(Arrays.toString(arr));
//    }
public static void main(String[] args) {
//        int[] arr = {99, 54, 43, 67, 76, 22, 54, 66, 21, 1, 14, 20};
    int[] arr = new int[1000];
    Random random = new Random();
    for (int i = 0; i < 1000; i++) {
        arr[i] = random.nextInt(1000);
    }
    bubbleSort(arr);
//        System.out.println(Arrays.toString(arr));
    for (int j = 0; j < 1000; j++) {
        System.out.print(arr[j]+" ");
        if(j%10 == 0) System.out.println();
    }
}

    static void bubbleSort(int[] arr){
        //check j value is swapped or not if not that means array is sorted
        boolean swapped;
        //run the steps or pass n-1 times
        for (int i = 0; i < arr.length-1; i++) {
            //initially swapped is false
            swapped = false;
            //for each step max item will come at last respective index
            // j run only for unsorted array as length (total length - pass no.)
            for (int j = 1; j < arr.length - i; j++) {
                //swap if the item is smaller than the previous item
                if(arr[j] < arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }

            //if you did not swap for particular value of i, it means the array is sorted hence stop the program
            if(!swapped){
                break;
            }
        }
    }
}
