package com.twoPointers;


// https://leetcode.com/problems/first-bad-version/submissions/


import java.util.Scanner;

public class FirstBadVersion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(firstBadVersion(n));
    }
    public static boolean isBadVersion(int num){
        return num==4?true:false;
    }
    static public int firstBadVersion(int n) {
        int start = 1;
        int end = n;

        //for check first bad version
        int min = Integer.MAX_VALUE;

        while(start <= end){
            int mid = start + (end - start) /2;
            if(isBadVersion(mid)){
                if(min > mid){
                    min = mid;
                }
                end = mid - 1;
            }
            else
                start = mid + 1;
        }

        return min;

    }
}
