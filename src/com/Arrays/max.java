package com.Arrays;

public class max {
    public static void main(String[] args) {
        int [] arr = {1,25,45,78,454,55,4,454,78,454,14,25,2235,141};
        System.out.println(max(arr));
        System.out.println(maxi(arr, 2, 6));
    }
    static int maxi(int[]arr, int start, int end){
        if(end>start){
            return -1;              //edge case 1
        }
        if(arr == null){
            return -1;              //edge case 2
        }
        int maxi_value = arr[start];
        for (int i = start; i < end; i++) {
            if(arr[i]>maxi_value){
                maxi_value = arr[i];
            }
        }
        return maxi_value;
    }
    static int max(int[]arr){
        if(arr.length ==0){
            return -1;              //edge case 3
        }
        int max_value = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max_value){
                max_value = arr[i];
            }
        }
        return max_value;
    }
}
