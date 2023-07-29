package com.assignments;
import java.lang.Math;
import java.util.Scanner;

public class Assignment_Question_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // AREA OF EQUILATERAL TRIANGLE
        float side_ = in.nextFloat();
        float areaofequi = 0;
        if(side_ == 0){
            System.out.println("invalid input");
        }
        while(side_!=0){
            areaofequi = (float)((Math.sqrt(3.0))*((side_)*(side_))/4.0);
            System.out.println("area of equilateral triangle is :- ");
            System.out.println(areaofequi);
            break;
        }
    }
}
