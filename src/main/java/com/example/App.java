package com.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("--- Number Utility Kit ---");
        System.out.println("1. Is Even: " + isEven(number));
        System.out.println("2. Is Odd: " + isOdd(number));
        System.out.println("3. Sum of Digits: " + sumOfDigits(number));
        System.out.println("4. Reversed Number: " + reverseDigits(number));
        
        scanner.close();
    }

    // Logic to check if a number is even
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    // Logic to check if a number is odd
    public static boolean isOdd(int n) {
        return n % 2 != 0;
    }

   
    public static int sumOfDigits(int n) {
        int sum = 0;
        n = Math.abs(n); // Handle negative numbers
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    // Logic to reverse the digits of a number
    public static int reverseDigits(int n) {
        int rev = 0;
        boolean isNegative = n < 0;
        n = Math.abs(n);
        while (n > 0) {
            rev = (rev * 10) + (n % 10);
            n /= 10;
        }
        return isNegative ? -rev : rev;
    }
}


