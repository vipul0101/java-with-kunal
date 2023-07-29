package com.function;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        

    }
    static boolean isArmStrong(int n){
        int original = n;
        int sum = 0;
        while(n>0){
            int rem = n%10;
            n = n/10;
            sum = sum + rem*rem*rem;
        }
        if(sum == original){
            return true;
        }
        return false;
    }
}
