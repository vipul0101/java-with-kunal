package com.function;
import java.util.Scanner;

public class methods {
    public static void main(String[] args) {
//        sum2();
        int ans = sum1();
        System.out.println(ans);
    }
    static void sum2() {
        Scanner in = new Scanner(System.in);
        int sum,num1,num2;
        System.out.println("enter number 1");
        num1 = in.nextInt();
        System.out.println("enter number 2");
        num2 = in.nextInt();
        sum = num1+num2;
    }
    static int sum1() {
        Scanner in = new Scanner(System.in);
        int sum,num1,num2;
        System.out.println("enter number 1");
        num1 = in.nextInt();
        System.out.println("enter number 2");
        num2 = in.nextInt();
        sum = num1+num2;
        return sum;
    }
}

