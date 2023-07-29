package com.function;

public class method_overloading {
    public static void main(String[] args) {
        fun(4);
        fun("kunal kushvaha");
    }
    static void fun(int a){
        System.out.println("first one");
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println("second one");
        System.out.println(name);
    }
}
