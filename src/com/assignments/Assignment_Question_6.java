package com.assignments;

import java.util.Scanner;

public class Assignment_Question_6 {
    public static void main(String[] args) {
        //HERE WE ARE CALCULATING THE AREA OF RHOMBUS BY USING BASE AND HEIGHT GIVEN BY THE USER INPUT
        Scanner in = new Scanner(System.in);
        System.out.println("enter the value of base of rhombus :- ");
        float base = in.nextFloat();
        System.out.println("enter the value of height of rhombus :- ");
        float height = in.nextFloat();
        float areaofrhombus = 0;

        if(base == 0 || height == 0){
            System.out.println("invalid input");
        }
        while(base != 0 && height != 0){
            areaofrhombus = (float)(base*height);
            System.out.println("area of rhombus is :- ");
            System.out.println(areaofrhombus);
            break;
        }
    }
}
