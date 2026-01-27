
import java.util.Scanner;
class SumNaturalFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n <= 0) {
            System.out.println("The number " + n + " is not a natural number");
            input.close();
            return;
        }
        int sumFor = 0;
        for (int i = 1; i <= n; i++) {
            sumFor += i;
        }
        int sumFormula = n * (n + 1) / 2;
        System.out.println("Sum using for = " + sumFor);
        System.out.println("Sum using formula = " + sumFormula);
        input.close();
    }
}
