package com.Operator;

// https://leetcode.com/problems/flipping-an-image/

import java.util.Arrays;

public class Flipping_an_Image_Google {
    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        image = flipAndInvertImage(image);
        for (int[] arr : image) {
            System.out.println(Arrays.toString(arr));
        }
    }

     static public int[][] flipAndInvertImage(int[][] image) {
         for (int[] row : image) {
             // reverse the array
             for (int i = 0; i < (image[0].length + 1) / 2; i++) {
                 //swap and also xor with it
                 int temp = row[i] ^ 1;
                 row[i] = row[image[0].length - 1 - i] ^ 1;
                 row[image[0].length - 1 - i] = temp;
             }
         }
         return image;
    }
}
