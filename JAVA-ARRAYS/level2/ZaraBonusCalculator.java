package javaArrays.level2;

import java.util.Scanner;

public class ZaraBonusCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Arrays to store salary and years of service
        double[][] employeeData = new double[10][2]; // [salary][years]
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Input loop with validation
        for (int i = 0; i < 10; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));

            System.out.print("Enter salary: ");
            double salary = sc.nextDouble();

            System.out.print("Enter years of service: ");
            double years = sc.nextDouble();

            // Validation
            if (salary <= 0 || years < 0) {
                System.out.println("Invalid input! Please enter valid values.");
                i--; // decrement index to retry
                continue;
            }

            employeeData[i][0] = salary;
            employeeData[i][1] = years;
        }

        // Bonus calculation loop
        for (int i = 0; i < 10; i++) {

            double salary = employeeData[i][0];
            double years = employeeData[i][1];

            if (years > 5) {
                bonus[i] = salary * 0.05;
            } else {
                bonus[i] = salary * 0.02;
            }

            newSalary[i] = salary + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary;
            totalNewSalary += newSalary[i];
        }

        // Output results
        System.out.println("\n===== ZARA BONUS SUMMARY =====");
        System.out.println("Total Old Salary  : " + totalOldSalary);
        System.out.println("Total Bonus Paid  : " + totalBonus);
        System.out.println("Total New Salary  : " + totalNewSalary);

        sc.close();
    }
}
