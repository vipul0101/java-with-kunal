package com.assignments;

import java.util.Scanner;

public class Assignment_Question_15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float b = in.nextFloat();
        float h = in.nextFloat();
        float l = in.nextFloat();
        float volofprism = 0;

        if (b == 0 || h == 0 || l == 0){
            System.out.println("invalid input");
        }
        while(b>0&&h>0&&l>0){
            volofprism = (float)(0.5*b*h*l);
            System.out.println("volume of prism is :- ");
            System.out.println(volofprism);
            break;
        }
    }
}
