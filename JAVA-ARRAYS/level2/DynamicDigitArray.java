package javaArrays.level2;

import java.util.Scanner;

public class DynamicDigitArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a. Take user input
        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        // b. Initial array size
        int maxDigit = 10;
        int[] digits = new int[maxDigit];

        // c. Index variable
        int index = 0;

        // d, e, f. Extract digits with dynamic resizing
        while (number != 0) {

            // a. If array is full, increase size
            if (index == maxDigit) {

                maxDigit += 10; // increase size by 10

                // b. Create temp array and copy data
                int[] temp = new int[maxDigit];
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }

                // c. Assign temp array to digits
                digits = temp;
            }

            digits[index] = (int)(number % 10);
            number = number / 10;
            index++;
        }

        // g. Initialize largest and second largest
        int largest = 0;
        int secondLargest = 0;

        // h. Find largest and second largest
        for (int i = 0; i < index; i++) {

            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            }
            else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // i. Display result
        System.out.println("\nLargest Digit        : " + largest);
        System.out.println("Second Largest Digit : " + secondLargest);

        sc.close();
    }
}
