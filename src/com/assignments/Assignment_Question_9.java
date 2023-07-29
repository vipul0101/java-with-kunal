package com.assignments;

import java.util.Scanner;

public class Assignment_Question_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float a = in.nextFloat();
        float perimeterofequi = 0;
        if(a == 0){
            System.out.println("invalid input");
        }
        while(a>0){
            perimeterofequi = (float)(3*a);
            System.out.println("perimeter of equilateral triangle is :- ");
            System.out.println(perimeterofequi);
            break;
        }
    }
}
