
import java.util.Scanner;
class GreatestFactorWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int greatest = 1;
        int i = number - 1;
        while (i >= 1) {
            if (number % i == 0) {
                greatest = i;
                break;
            }
            i--;
        }
        System.out.println("Greatest factor beside itself = " + greatest);
        input.close();
    }
}
