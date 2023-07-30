package com.Arrays;

public class Arrays_1 {
    public static void main(String[] args) {
        //syntax
        // datatype [] variable_name = new datatype[size];
        // store 5 roll numbers
        int [] rnos = new int[5];
        //or directly
        int [] rnos2 = {23,56,48,78,88,98,87};

        // print elements from an array
        System.out.println(rnos2[5]);
        System.out.println(rnos[2]);

        String [] name = new String[5];
        System.out.println(name[2]);        // it will show null in output
        name[2] = "vipul";
        System.out.println(name[2]);


    }
}
