package com.Arrays.binary_search;

public class Ceiling_of_a_number {
    public static void main(String[] args) {
        int [] arr = {2,4,6,8,11,13,15,18,20,26,55};
        int target = 66;
        System.out.println(ceiling(arr, target));
    }
    static int ceiling(int[]arr, int target){
        if(target > arr[arr.length-1]){
            return -1;
        }
        int start = 0;
        int end = arr.length -1;
        int mid;
        while(start<=end){
            mid = start + (end-start)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                start = mid +1;
            }
            else{
                end = mid-1;
            }
        }
        return arr[start];
    }
}
