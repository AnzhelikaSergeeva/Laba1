package com.company;

import java.util.Scanner;

// Determines whether user's string is a palindrom or not
public class Palindrom {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (isPalindrom(s)) System.out.println("This string is a palindrom");
        else System.out.println("This string is not a palindrom");
    }

    // Reverse the string
    public static String reverseString(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++){
            result = s.charAt(i) + result;
        }
        return result;
    }

    // Сompare two strings
    public static boolean equalTo(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        } else {
            for (int i = 0; i < s1.length(); i++) {
                if (((int) s1.charAt(i) - (int) s2.charAt(i) != 0 ) &&
                        ((int) s1.charAt(i) - (int) s2.charAt(i) != 32) &&
                        ((int) s1.charAt(i) - (int) s2.charAt(i) != -32))
                    return false;
            }
            return true;
        }
    }

    //Comparing the original string with the inverted one
    public static boolean isPalindrom(String s) {
        if (equalTo(s, reverseString(s))) return true;
        return false;
    }

}
