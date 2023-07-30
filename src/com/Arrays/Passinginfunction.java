package com.Arrays;

import java.util.Arrays;

public class Passinginfunction {
    public static void main(String[] args) {
        int [] nums = {2,45,78,74,54,69};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[]arr){
        arr[0] = 2109;
    }
}
