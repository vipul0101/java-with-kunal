package com.function;

public class String_example {
    public static void main(String[] args) {
//        String message = greet();
//        System.out.println(message);

        String personalised = mygreet("Vipul Gupta");
        System.out.println(personalised);
    }

    private static String mygreet(String name) {
        return "Hello " + name;
    }

    static String greet(){
        String greeting;
        greeting = "hello world ";
        return greeting;
    }
}
