package com.twoPointers;


// https://leetcode.com/problems/squares-of-a-sorted-array/



import java.util.Arrays;

public class SquaresofaSortedArray {

    public static void main(String[] args) {
	// write your code here
        int[] nums = {-7,-3,2,3,11};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }
    static public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        int start = 0;
        int end = nums.length-1;
        int j = nums.length-1;

        while(start < end){
            if(nums[start]*nums[start] < nums[end]*nums[end]){
                ans[j] = nums[end]*nums[end];
                end--;
            }
            else {
                ans[j] = nums[start]*nums[start];
                start++;
            }
            j--;
        }
        ans[j] = nums[start]*nums[start];

        return ans;
    }
}
