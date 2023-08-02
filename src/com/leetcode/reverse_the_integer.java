package com.leetcode;

public class reverse_the_integer {
    public static int reverse(int x) {
            // Check if the input value is within the 32-bit range.
        if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) {
            int reversed = 0;
            while (x != 0) {
                int digit = x % 10;
                x /= 10;

                    // Check for potential overflow before updating the reversed value.
                if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7)) {
                    return 0;
                }
                if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && digit < -8)) {
                    return 0;
                }
                reversed = reversed * 10 + digit;
            }
            return reversed;
        } else {
                // If the input value exceeds 32-bit range, return 0.
            return 0;
        }
    }

    public static void main(String[] args) {
        int inputValue = 12345; // Replace this with any value you want to reverse.
        int reversedValue = reverse(inputValue);
        System.out.println("Original Value: " + inputValue);
        System.out.println("Reversed Value: " + reversedValue);
    }
}


