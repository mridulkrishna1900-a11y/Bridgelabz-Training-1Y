
import java.util.Scanner;
class EmployeeBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salary = input.nextDouble();
        int years = input.nextInt();
        double bonus = 0.0;
        if (years > 5) {
            bonus = salary * 5 / 100.0;
        }
        System.out.println("Bonus amount = " + bonus);
        input.close();
    }
}
