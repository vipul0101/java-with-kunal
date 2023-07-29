package com.assignments;
import java.lang.Math;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Assignment_Question_18 {
    public static void main(String[] args) {
        System.out.println("THIS PROGRAMME ONLY WORKS ON POSITIVE VALUES SO PLEASE DON'T GIVE INPUT ANY NEGATIVE VALUE OR ZERO");
        System.out.println("here we are having only 3 options for input the sides of base and the are :- 3, 4, 6");
        System.out.println("please input among these values for getting better results");
        Scanner in = new Scanner(System.in);
        System.out.print("enter the no of sides of base for finding the shape of pyramid :- ");
        int s = in.nextInt();
        if(s == 3){
            System.out.println("it is a triangular pyramid");
            System.out.println("for finding the value of volume of triangular pyramid you have to give input it's base length, height of base triangle, height of pyramid :- ");
            System.out.println("base_length_of_triangle :- ");
            int base_length_of_triangle = in.nextInt();
            System.out.println("height_of_triangle :- ");
            int height_of_triangle = in.nextInt();
            System.out.println("height_of_pyramid :- ");
            int height_of_pyramid = in.nextInt();
            if(base_length_of_triangle == 0 || height_of_triangle == 0 || height_of_pyramid == 0){
                System.out.println("invalid input");
            }else {
                while (base_length_of_triangle > 0 && height_of_triangle > 0 && height_of_pyramid > 0) {
                    int area_of_triangle =  (base_length_of_triangle * height_of_triangle)/2;
                    float volume_of_triangular_pyramid = (float) ((area_of_triangle * height_of_pyramid) / 3);
                    System.out.println("volume of triangular pyramid is :- ");
                    System.out.println(volume_of_triangular_pyramid);
                    break;
                }
            }
        }
        if(s == 4){
            System.out.println("it is a quadrilateral pyramid");
            System.out.println("give input length and breadth for finding that the pyramid is square or rectangle");
            System.out.println("length :- ");
            int LENGTH = in.nextInt();
            System.out.println("breadth :- ");
            int BREADTH = in.nextInt();
            if (LENGTH == BREADTH){
                System.out.println("it is a square pyramid");
                System.out.println("the area of square :- ");
                int area_of_square = LENGTH*BREADTH;

                System.out.println(area_of_square);

                System.out.println("height_of_pyramid is :- ");
                int height_of_pyramid = in.nextInt();

                float volume_of_square_pyramid = (float) ((area_of_square*height_of_pyramid)/3);

                System.out.println("volume of square pyramid is :- ");
                System.out.println(volume_of_square_pyramid);
            }
            else {
                System.out.println("it is a rectangular pyramid");
                System.out.println("the area of rectangle is :- ");
                int area_rectangle = LENGTH*BREADTH;

                System.out.println(area_rectangle);

                System.out.println("height of pyramid is :- ");
                int height_of_pyramid = in.nextInt();

                float volume_of_rectangular_pyramid = (float) ((area_rectangle*height_of_pyramid)/3);

                System.out.println("volume_of_rectangular_pyramid is :- ");
                System.out.println(volume_of_rectangular_pyramid);
            }
        }
        if(s == 6){
            System.out.println("it is a hexagonal pyramid");
            System.out.println("give input side of hexagon base :- ");
            int side_of_hexagon = in.nextInt();
            if(side_of_hexagon <= 0){
                System.out.println("invalid input");
            }
            else{
                float area_of_hexagon = (float) ((3*Math.sqrt(3)*(side_of_hexagon*side_of_hexagon))/2);
                System.out.println("area of hexagonal pyramid is :- ");
                System.out.println(area_of_hexagon);

                System.out.println("height of pyramid is :- ");
                int height_of_pyramid = in.nextInt();

                float volume_of_hexagonal_pyramid = (float) ((area_of_hexagon*height_of_pyramid)/3);
                System.out.println("volume of hexagonal pyramid is :- ");
                System.out.println(volume_of_hexagonal_pyramid);
            }
        }
    }
}