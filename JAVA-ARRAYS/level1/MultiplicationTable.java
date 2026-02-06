package javaArrays.level1;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. Get an integer input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Define an integer array to store results from 1 to 10
        int[] table = new int[10];

        // b. Run a loop from 1 to 10 and store results in the array
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }

        // c. Display the multiplication table
        System.out.println("\nMultiplication Table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }

        sc.close();
    }
}
