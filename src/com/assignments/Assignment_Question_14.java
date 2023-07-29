package com.assignments;

import java.util.Scanner;

public class Assignment_Question_14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //VOLUME OF CONE
        float pi = 3.14F;
        float radofcon = in.nextFloat();
        float heightofcone = in.nextFloat();
        float volofcone = 0;

        if(radofcon == 0 || heightofcone == 0){
            System.out.println("invalid input");
        }
        else{
            while(radofcon>0 && heightofcone>0){
                volofcone = (float) ((1/3)*(pi)*(radofcon*radofcon)*(heightofcone));
                System.out.println("volume of cone is :- ");
                System.out.println(volofcone);
                break;
            }
        }
    }
}
