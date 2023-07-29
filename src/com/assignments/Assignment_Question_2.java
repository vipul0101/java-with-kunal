package com.assignments;
import java.util.Scanner;
public class Assignment_Question_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the value for the base :- ");
        float base = in.nextInt();
        System.out.print("enter the value for the height :- ");
        float height = in.nextInt();
        float area1 = 0;
        if(base == 0 || height == 0){
            System.out.println("you have enter invalid input broootherrrrr");
        }
        while(base!=0 && height!=0){
            area1 =(float) (((base)*(height))/2.0);
            System.out.print("area of triangle is :- ");
            System.out.print(area1);
            break;
        }
    }
}
