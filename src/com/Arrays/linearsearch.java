package com.Arrays;

public class linearsearch {
    public static void main(String[] args) {
        int[]arr = {24,78,98,56,54,52,2,4,5,4};
        int target = 78;
        int ans = linsearch(arr,target);
        System.out.println(ans);
        int ans2 = linsearch2(arr,target);
        System.out.println(ans2);
    }
    static int linsearch(int[]arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }
    static int linsearch2(int[]arr, int target){
        if(arr.length == 0){
            return Integer.MAX_VALUE;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if(element == target){
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }
}