package com.Arrays.binary_search;

public class programme1 {
    public static void main(String[] args) {
        int [] arr = {-14,-11,-10,-9,-6,-3,0,2,5,6,4,77,88,99,999};
        int ans = binarysearch(arr,77);
        System.out.println(ans);

    }
    static int binarysearch(int [] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int midele;
        while(start<end){
            midele = start + (end-start)/2;
            if(target == arr[midele]){
                return midele;
            }
            else if(target < arr[midele]){
                end = midele-1;
            }
            else{
                start = midele+1;
            }
        }
        return -1;
    }
}
