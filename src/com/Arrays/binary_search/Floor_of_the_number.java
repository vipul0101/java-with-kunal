package com.Arrays.binary_search;

public class Floor_of_the_number {
    public static void main(String[] args) {
        int [] arr = {2,4,6,8,11,13,15,18,20,26,55};
        int target = 1;
        System.out.println(ceiling1(arr, target));
    }
    static int ceiling1(int[]letters, int target){

        int start = 0;
        int end = letters.length -1;
        int mid;
        while(start<=end){
            mid = start + (end-start)/2;

            if(letters[mid] < target){
                start = mid +1;
            }
            else{
                end = mid-1;
            }
        }
        return letters[start % letters.length];
    }
}
