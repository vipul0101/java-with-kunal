package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class multidimentional_array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
         1 2 3
         4 5 6
         7 8 9
        */
        int [][] arr = new int[3][3];

        int [][] arr1 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.toString(arr1));

        int [][] arr2 = new int[3][3];
        for(int row = 0; row<arr2.length; row++){
            for(int col = 0; col<arr[row].length; col++){
                arr[row][col] = in.nextInt();
            }
        }
    }
}
