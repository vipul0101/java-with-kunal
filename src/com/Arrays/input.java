package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // array of primitives
//        int [] arr = new int [5];
//        // we can give direct input to the array by using:-
//        arr[0] = 23;
//        arr[1] = 223;
//        arr[2] = 3;
//        arr[3] = 43;
//        arr[4] = 45;
//
//        // a different way to print the whole array using only one line ;-)
//        System.out.println(Arrays.toString(arr));
//
//      //  System.out.println(arr[5]);         // show an error due to printing outside the array length :-)
//        //or we can use for loop for giving the input like:-
//        for(int i =0; i<arr.length; i++){
//            arr[i] = in.nextInt();
//        }
////        for(int i =0; i<arr.length; i++){
////            System.out.print(arr[i] + " ");
////        }
//        //we can have a modified version for printing the full array using for each loop:-
//        for(int num : arr){
//            System.out.print(num + " ");
//        }


        // array of objects
        String [] str = new String[5];
        for(int i =0; i<str.length; i++){
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

        str[1] = "vipul";
        System.out.println(Arrays.toString(str));

    }
}
