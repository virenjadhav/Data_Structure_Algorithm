package com.binary_search;

public class OrderAgnosticBS {
    public int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        boolean isASC = arr[start] < arr[end];

        while (start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid]== target) return  mid;
            if(isASC){
                if(arr[mid] > target) {
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            else{
                if (arr[mid] > target) {
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
