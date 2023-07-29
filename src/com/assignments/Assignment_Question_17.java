package com.assignments;

import java.util.Scanner;

public class Assignment_Question_17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //VOLUME OF SPHERE
        int radofsphere = in.nextInt();
        float volumeofsphere = 0;
        if(radofsphere == 0){
            System.out.println("invalid input");
        }
        while(radofsphere > 0){
            float value = (float) (3.142 * radofsphere * radofsphere * radofsphere);
            volumeofsphere = (4*value)/3;
            System.out.println("volume of sphere is :- ");
            System.out.println(volumeofsphere);
            break;
        }
    }
}
