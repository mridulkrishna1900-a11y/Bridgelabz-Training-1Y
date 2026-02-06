package javaArrays.level1;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. Declare array, total, and index
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        // b. Infinite while loop
        while (true) {
            System.out.print("Enter a number: ");
            double input = sc.nextDouble();

            // c. Break if 0 or negative number entered
            if (input <= 0) {
                break;
            }

            // d. Break if array size reaches 10
            if (index == 10) {
                break;
            }

            // e. Store value in array and increment index
            numbers[index] = input;
            index++;
        }

        // f. Loop to calculate total
        for (int i = 0; i < index; i++) {
            System.out.println("Value " + (i + 1) + ": " + numbers[i]);
            total += numbers[i];
        }

        // g. Display the total
        System.out.println("Total sum of numbers: " + total);

        sc.close();
    }
}
