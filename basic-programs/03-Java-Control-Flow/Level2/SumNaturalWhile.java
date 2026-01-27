
import java.util.Scanner;
class SumNaturalWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n <= 0) {
            System.out.println("The number " + n + " is not a natural number");
            input.close();
            return;
        }
        int sumWhile = 0;
        int i = 1;
        while (i <= n) {
            sumWhile += i;
            i++;
        }
        int sumFormula = n * (n + 1) / 2;
        System.out.println("Sum using while = " + sumWhile);
        System.out.println("Sum using formula = " + sumFormula);
        input.close();
    }
}
