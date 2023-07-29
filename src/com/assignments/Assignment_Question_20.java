package com.assignments;

import java.util.Scanner;

public class Assignment_Question_20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sos = in.nextInt();
        if(sos == 0){
            System.out.println("invalid input");
        }
        else{
            float TSA = (float) (6*sos*sos);
            System.out.println("total surface area is :- ");
            System.out.println(TSA);
        }
    }
}
