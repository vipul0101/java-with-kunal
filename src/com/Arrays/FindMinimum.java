package com.Arrays;

public class FindMinimum {
    public static void main(String[] args) {
        int [] arr = {2,56,-5,-66,-109,-5,-85};
        System.out.println(minimumvalue(arr));
    }
    static int minimumvalue(int[]arr){
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
