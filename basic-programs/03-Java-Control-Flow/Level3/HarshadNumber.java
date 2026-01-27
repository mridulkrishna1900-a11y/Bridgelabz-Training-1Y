
import java.util.Scanner;
class HarshadNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int original = input.nextInt();
        int number = original;
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        if (sum != 0 && original % sum == 0) {
            System.out.println(original + " is a Harshad Number");
        } else {
            System.out.println(original + " is not a Harshad Number");
        }
        input.close();
    }
}
