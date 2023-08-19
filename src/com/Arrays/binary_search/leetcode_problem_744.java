package com.Arrays.binary_search;

public class leetcode_problem_744 {
    public static void main(String[] args) {
        char[]letters = {'c', 'f', 'j'};
        char target = 'j';
        System.out.println(nextGreatestLetter(letters,target));

    }
    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length -1;
        int mid;
        while(start<=end){
            mid = start + (end-start)/2;

            if(letters[mid] < target){
                start = mid +1;
            }
            else{
                end = mid-1;
            }
        }
        return letters[start % letters.length];

    }
}
