package com.Arrays.binary_search;

public class peak_position_of_mountain_array {
    public static void main(String[] args) {
        int [] arr = {2,3,4,5,7,8,1};
        System.out.println(peak(arr));
    }
    static int peak(int [] arr){
        int start = 0;
        int end = arr.length-1;
        int ans = 0;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(mid == 0){
                ans = mid+1;
                break;

            }
            if(arr[mid-1]<arr[mid] && arr[mid+1] < arr[mid]){
                ans = mid;
                break;
            }
            else if(arr[mid-1]<arr[mid] && arr[mid+1] > arr[mid]){
                start = mid+1;
            }else if(arr[mid-1]>arr[mid] && arr[mid+1] < arr[mid]){
                end = mid-1;
            }
        }
        return ans;
    }
}
