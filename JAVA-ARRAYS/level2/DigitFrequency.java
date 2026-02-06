package javaArrays.level2;

import java.util.Scanner;

public class DigitFrequency {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a. Take input for a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int temp = number;
        int digitCount = 0;

        // b. Find count of digits
        while (temp != 0) {
            digitCount++;
            temp = temp / 10;
        }

        // c. Store digits in array
        int[] digits = new int[digitCount];
        temp = number;

        for (int i = 0; i < digitCount; i++) {
            digits[i] = temp % 10;
            temp = temp / 10;
        }

        // d. Frequency array
        int[] frequency = new int[10];

        for (int i = 0; i < digitCount; i++) {
            frequency[digits[i]]++;
        }

        // e. Display frequency
        System.out.println("\nDigit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " time(s)");
            }
        }

        sc.close();
    }
}
