package com.Arrays.binary_search;

public class position_of_element_in_infinite_array {
    public static void main(String[] args) {
        int [] arr = {1,2,3,5,6,8,9,10,11,12,13,14,16,17,19,20,21,23,25,28,29};
        int target = 28;
        System.out.println(ans(arr, target));
    }
    static int ans(int [] arr, int target){
        int start = 0;
        int end = 1;
        while(target > arr[end]){
            int temp= end + 1;
            end = end +(end-start + 1)*2;
            start = temp;
            if(end>=arr.length){
                end = arr.length-1;
                break;
            }
        }
        return search_infinite(arr, target, start, end);
    }
    static int search_infinite(int[]arr, int target, int start, int end){

        int midele;
        while(start<=end){
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
