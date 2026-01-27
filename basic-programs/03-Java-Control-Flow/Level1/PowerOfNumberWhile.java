
import java.util.Scanner;
class PowerOfNumberWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int power = input.nextInt();
        if (power < 0) {
            System.out.println("Power should be non-negative");
            input.close();
            return;
        }
        long result = 1;
        int i = 1;
        while (i <= power) {
            result *= number;
            i++;
        }
        System.out.println(number + "^" + power + " = " + result);
        input.close();
    }
}
