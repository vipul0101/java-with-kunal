package com.Arrays;

public class linear_search_for_strings {
    public static void main(String[] args) {
        String name = "kunal kushvaha";
        char Target = 'u';
        System.out.println(searchstring(name,Target));
    }
    static boolean searchstring2(String str, char target){
        if(str.isEmpty()){
            return false;
        }
        for(char ch:str.toCharArray()){
            if(ch == target){
                return true;
            }
        }
        return false;
    }

    static boolean searchstring(String str, char target){
        if(str.isEmpty()){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
