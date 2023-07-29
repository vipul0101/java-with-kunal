package com.assignments;
import java.util.Scanner;
public class Assignment_Question_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float b = in.nextFloat();
        float s = in.nextFloat();
        float pop = 0;
        if(b == 0 || s == 0){
            System.out.println("invalid input");
        }
        while(b>0 && s>0){
            pop = (float)(2*(b+s));
            System.out.println("perimeter of parallelogram is :- ");
            System.out.println(pop);
            break;
        }
    }
}
