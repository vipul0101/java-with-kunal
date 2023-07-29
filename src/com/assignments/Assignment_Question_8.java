package com.assignments;

import java.util.Scanner;

public class Assignment_Question_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float r = in.nextFloat();
        if(r == 0){
            System.out.println("invalid input");
        }
        while(r>0){
            float perimeter = (float)(2*3.14*r);
            System.out.println("perimeter of circle is :- ");
            System.out.println(perimeter);
            break;
        }
    }
}
