package com.Arrays;

import java.util.Scanner;

public class linearsearchinrange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] arr = {23,54,68,2,1,5,7,8,778,5,4,1245};
        System.out.println("enter your target to search");
        int target = in.nextInt();
        System.out.println("enter your starting index for giving the range for search");
        int start = in.nextInt();
        System.out.println("enter your ending index value for search");
        int end = in.nextInt();
        int ans = searchinrange(arr,target,start,end);
        System.out.println("your target is on the index number :- " + ans);
    }
    static int searchinrange(int[]arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }
        for (int i = start; i <= end; i++) {
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        return -1;
    }
}
