package com.assignments;
import java.lang.Math;
import java.util.Scanner;
public class Assignment_Question_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
        HERE WE HAVE TO FIND THE AREA OF ISOSCELES TRIANGLE
        FOR THAT WE KNOW IN AN ISOSCELES TRIANGLE THERE ARE TWO EQUAL SIDES AND ONE SIDE IS OF DIFFERENT VALUE
        FIRSTLY LET (side1 = side2) ARE TWO EQUAL SIDES AND THE UNEQUAL SIDE NAMED AS (base)
        TO GET THE AREA WE HAVE TO FIND THE HEIGHT OF ISOSCELES TRIANGLE BY USING FORMULA :- height = (side1)*(side1)-(base/2)*(base/2)
        LET US ONLY TAKE (side1) AS TWO EQUAL SIDE AND MAKE OUR PROGRAMME MORE COMPATIBLE WITH USING IT
        */
        System.out.println("enter the value of equal side :- ");
        float side1 = in.nextFloat();
        System.out.println("enter the value of base of the triangle :- ");
        float base = in.nextFloat();

        float heightsq = (float)((side1)*(side1)-(base)*(base)/4.0);
        float height = (float) Math.sqrt(heightsq);

        if(side1 == 0|| base ==0){
            System.out.println("Invalid Input");
        }
        while(side1 !=0 && base !=0){
            float area = (float)(((base)*(height))/2.0);
            System.out.println("area of isosceles triangle is :- ");
            System.out.println(area);
            break;
        }

    }
}
