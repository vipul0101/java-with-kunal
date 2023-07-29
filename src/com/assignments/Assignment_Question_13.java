package com.assignments;

import java.util.Scanner;

public class Assignment_Question_13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sideofrhombus = in.nextInt();
        int perimeterofrhombus = 0;

        if(sideofrhombus == 0){
            System.out.println("invalid input");
        }
        while(sideofrhombus>0){
            perimeterofrhombus = 4*sideofrhombus;
            System.out.println("perimeter of rhombus is :- ");
            System.out.println(perimeterofrhombus);
            break;
        }
    }
}
