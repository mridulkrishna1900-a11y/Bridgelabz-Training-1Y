package javaArrays.level1;

import java.util.Scanner;

public class OddEvenArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. Get integer input and check for natural number
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Error: Please enter a natural number.");
            sc.close();
            return;
        }

        // b. Create arrays for odd and even numbers
        int size = number / 2 + 1;
        int[] odd = new int[size];
        int[] even = new int[size];

        // c. Index variables
        int oddIndex = 0;
        int evenIndex = 0;

        // d. Save odd and even numbers into arrays
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                even[evenIndex] = i;
                evenIndex++;
            } else {
                odd[oddIndex] = i;
                oddIndex++;
            }
        }

        // e. Print odd numbers array
        System.out.print("\nOdd Numbers:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(odd[i] + " ");
        }

        // Print even numbers array
        System.out.print("\nEven Numbers:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(even[i] + " ");
        }

        sc.close();
    }
}
