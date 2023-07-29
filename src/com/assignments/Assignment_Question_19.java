package com.assignments;
import java.lang.Math;
import java.util.Scanner;

public class Assignment_Question_19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int radiusofcyl = in.nextInt();
        int heightofcyl = in.nextInt();

        if (radiusofcyl == 0 || heightofcyl == 0){
            System.out.println("invalid input");
        }
        else{
            float curvedsurfacearea = (float) (2*Math.PI*radiusofcyl*heightofcyl);
            System.out.println("curved surface area is :- ");
            System.out.println(curvedsurfacearea);
        }

    }
}
