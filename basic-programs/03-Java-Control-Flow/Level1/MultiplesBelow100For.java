
import java.util.Scanner;
class MultiplesBelow100For {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number <= 0 || number >= 100) {
            System.out.println("Enter a positive integer less than 100");
            input.close();
            return;
        }
        for (int i = 100; i >= 1; i--) {
            if (i % number == 0) {
                System.out.println(i);
            }
        }
        input.close();
    }
}
