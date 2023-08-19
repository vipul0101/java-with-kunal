package com.Arrays.binary_search;

public class orderagnosticBS {
    public static void main(String[] args) {
        int [] arr = {-14,-11,-10,-9,-6,-3,0,2,5,6,4,77,88,99,999};
        int [] arr2 = {99,88,77,66,55,44,33,22,11,10,9,8,7,6,5,4,3,2,1,0};
        int ans2 = binarysearch(arr2,88);
        System.out.println(ans2);
        int ans = binarysearch(arr,77);
        System.out.println(ans);
    }
    static int binarysearch(int [] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int mid;

        boolean IsAsc = arr[start]<arr[end];

        while(start<end){
            mid = start + (end-start)/2;
            if(target == arr[mid]){
                return mid;
            }
            if(IsAsc){
                if(target < arr[mid]){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }else{
                if(target > arr[mid]){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }

        }
        return -1;
    }
}
