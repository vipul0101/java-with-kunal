package com.assignments;

import java.util.Scanner;

public class Assignment_Question_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a2 = in.nextInt();
        int poS = 0;
        if(a2 == 0){
            System.out.println("invalid input");
        }
        while(a2>0){
            poS = 4*a2;
            System.out.println(poS);
            break;
        }
    }
}
