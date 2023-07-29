package com.assignments;

import java.util.Scanner;

public class Assignment_Question_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a1 = in.nextInt();
        int b1 = in.nextInt();
        int poR = 0;
        if(a1 == 0 || b1 == 0){
            System.out.println("invalid input");
        }
        while(a1>0 && b1>0){
            poR = 2*(a1+b1);
            System.out.println(poR);
            break;
        }
    }
}
