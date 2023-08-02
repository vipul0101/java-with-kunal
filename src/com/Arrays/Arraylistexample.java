package com.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylistexample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList <Integer> list = new ArrayList<>(6);

//        list.add(25);
//        list.add(45);
//        list.add(254);
//        list.add(2523);
//        list.add(225);
//        list.add(213);
//        list.add(2511);
//        list.add(25324);
//        list.add(23445);

//        System.out.println(list);
//        System.out.println(list.contains(548897));
        for (int i = 0; i < 6; i++) {
            System.out.println(in.nextInt());
        }
        for (int i = 0; i < 6; i++) {
            System.out.println(list.get(i));
            
        }
        System.out.println(list);

    }
}
