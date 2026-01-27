
import java.util.Scanner;
class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double p = input.nextDouble();
        double c = input.nextDouble();
        double m = input.nextDouble();
        double average = (p + c + m) / 3.0;
        String grade;
        String remarks;
        if (average >= 80) {
            grade = "A";
            remarks = "Level 4";
        } else if (average >= 70) {
            grade = "B";
            remarks = "Level 3";
        } else if (average >= 60) {
            grade = "C";
            remarks = "Level 2";
        } else if (average >= 50) {
            grade = "D";
            remarks = "Level 1";
        } else if (average >= 40) {
            grade = "E";
            remarks = "Level 1-";
        } else {
            grade = "F";
            remarks = "Remedial";
        }
        System.out.println("Average = " + average);
        System.out.println("Grade = " + grade);
        System.out.println("Remarks = " + remarks);
        input.close();
    }
}
