package com.company;

import java.util.Scanner;

import static java.lang.Math.sqrt;
//Prints all prime numbers starting from 2 to the number entered by user
public class Primes {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 2; i < number; i++){
            if (isPrime(i)==true) System.out.println(i);
        }
    }

    //Finding the remainder of a division
    public static boolean isPrime(int n){
        final double MAX_DIVISOR = sqrt(n);
        for (int i = 2; i <= MAX_DIVISOR; i++){
            if (n % i == 0) return false;
        }
        return true;
    }
}
