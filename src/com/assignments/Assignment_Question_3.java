package com.assignments;
import java.util.Scanner;
public class Assignment_Question_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the value of length :- ");
        float length = in.nextFloat();
        System.out.print("enter the value of breadth :- ");
        float breadth = in.nextFloat();
        float Area = 0;
        if (length == 0 || breadth == 0) {
            System.out.println("Invalid Input");
        }
        while(length!=0 && breadth!=0){
            Area = (float) (length * breadth);
            System.out.print("area of rectangle is :- ");
            System.out.println(Area);
            break;
        }
    }
}
