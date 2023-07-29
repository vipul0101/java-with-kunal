package com.assignments;
import java.util.Scanner;
public class Assignment_Question_1 {
    public static void main(String[] args) {
        // Find the Area of circle :-
        Scanner in = new Scanner(System.in);
        float area = 0;
        System.out.println("enter the value of radius");
        float radius = in.nextInt();
        while(radius>0){
            area = (float) ((3.14)*(radius)*(radius));
            System.out.println(area);
            break;
        }
    }
}