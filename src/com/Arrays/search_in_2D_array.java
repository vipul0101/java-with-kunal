package com.Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class search_in_2D_array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [][] arr = {
                {22,52,8,78,9},
                {5,4,89,7},
                {6,5,6,9,8,4,5,4,1},
                {58,4,559}
        };
//        int target = in.nextInt();
//        int [] ans = search(arr,target);
//        System.out.println(Arrays.toString(ans));
        int ans2 = max(arr);
        System.out.println(ans2);
        System.out.println(Integer.MIN_VALUE);
    }
    static int [] search(int[][]arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for(int col =0; col < arr[row].length; col++){
                if(arr[row][col] == target){
                    return new int []{row,col};
                }
            }
        }
        return new int[]{-1, -1};
    }
    static int max(int[][]arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j<arr[i].length; j++){
                if(arr[i][j]>max){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}
