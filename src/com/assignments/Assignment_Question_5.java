package com.assignments;
import java.lang.Math;
import java.util.Scanner;

public class Assignment_Question_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the value of base :- ");
        float Base = in.nextFloat();
        System.out.println("enter the value of side :- ");
        float Side = in.nextFloat();
        System.out.println("enter the value of angle between 60 and 120 :- ");
        float angle = in.nextFloat();
        float sin_x = (float)(Math.sin(Math.toRadians(angle)));

        if(Side == 0 || Base == 0 || (angle<60.0 && angle>120.0)){                  // here we set a range for angle of parallelogram
            System.out.println("Invalid Input");
        }
        while(Base != 0 && Side != 0){
            float AREA = (Side * Base * sin_x);
            System.out.println("area of parallelogram is :- ");
            System.out.println(AREA);
            break;
        }
    }
}
