package com.function;
import java.util.Arrays;
public class Change_Value {
    public static void main(String[] args) {
        int [] arr = {20,56,7,8,9,44};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] nums) {
            nums[0] = 99;
    }
}
