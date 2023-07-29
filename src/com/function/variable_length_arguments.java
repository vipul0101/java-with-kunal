package com.function;

import java.util.Arrays;

public class variable_length_arguments {
    public static void main(String[] args) {
        fun(2,4,8,77,89,56,58,78);
        multiple(2,4,"fortnite", "gang", "biting");
    }
    static void multiple(int a, int b, String ...v){
        System.out.println(" ");
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v)); //this will make an Arrays of the whole numbers you are going to give during function call
    }
}
