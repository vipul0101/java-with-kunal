package com.Arrays.binary_search;

public class Leetcode_question_34 {
    public static void main(String[] args) {

    }
    public int[] searchRange(int[] nums, int target) {
        int [] ans = {-1, -1};
        int start = search(nums,target,true);
        int end = search(nums,target,false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }
    int search(int[]nums, int target, boolean firstindex){
        int ans = -1;
        int start = 0;
        int end = nums.length-1;
        int mid;
        while(start<=end){
            mid = start + (end-start)/2;

            if(target < nums[mid]){
                end = mid-1;
            }
            else if(target>nums[mid]){
                start = mid+1;
            }
            else{
                ans = mid;
                if(firstindex){
                    end = mid-1;
                }
                else{
                    start = mid +1;
                }
            }
        }
        return ans;
    }
}
