package com.Arrays.binary_search;

public class peak_element {
    public static void main(String[] args) {
        int [] arr = {2,1};
        System.out.println(findPeakElement(arr));
//        System.out.println(peak2(arr));
    }
    public static int findPeakElement(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        int ans = 0;
        while(start<end){
            int mid = start+(end-start)/2;
            if((mid == 0 && arr[mid]>arr[mid+1])){
                ans = mid;
                break;
            }
            else if(mid>0){
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
        }
        return ans;
    }
    static int peak2(int[]arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end = mid;
            }else{
                start = mid+1;
            }
        }
        return start;
    }
}
