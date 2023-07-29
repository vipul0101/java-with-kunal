package com.function;

public class Shadowing {
    static int x = 90;     // this x will be shadowed
    public static void main(String[] args) {
        System.out.println(x);      //90
        int x;      //declaring the variable
//        System.out.println(x);        // we can not get the result without initialising the element we firstly have to initialise it
        x = 40;     //initialisation
        System.out.println(x);     //40      // this will print the new value of x
        fun();
    }

    static void fun(){
        System.out.println(x);      // here we have used the already defined value of x and print that inside the main function
    }
}
