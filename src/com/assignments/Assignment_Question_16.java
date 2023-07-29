package com.assignments;

import java.util.Scanner;

public class Assignment_Question_16 {
    public static void main(String[] args) {
        // volume of cylinder
        Scanner in = new Scanner(System.in);
        float rad = in.nextFloat();
        float hei = in.nextFloat();
        float volofcyl = 0;

        if(rad ==0 || hei == 0){
            System.out.println("invalid input");
        }
        while(rad>0 && hei>0){
            volofcyl = (float)(3.142*rad*rad*hei);
            System.out.println("volume of cylinder is :- ");
            System.out.println(volofcyl);
            break;
        }
    }
}
