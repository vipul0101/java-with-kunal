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
                {58,4,59}
        };
        int target = in.nextInt();
        int [] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int [] search(int[][]arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for(int j =0; j<arr[i].length; j++){
                return new int[]{i,j};
            }
        }
        return new int[]{-1, -1};
    }
}
