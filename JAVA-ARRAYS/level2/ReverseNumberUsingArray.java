package javaArrays.level2;

import java.util.Scanner;

public class ReverseNumberUsingArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a. Take user input
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

        // d. Create reverse array
        int[] reverseDigits = new int[digitCount];

        for (int i = 0; i < digitCount; i++) {
            reverseDigits[i] = digits[digitCount - 1 - i];
        }

        // e. Display reversed number
        System.out.print("\nReversed Number: ");
        for (int i = 0; i < digitCount; i++) {
            System.out.print(reverseDigits[i]);
        }

        sc.close();
    }
}
