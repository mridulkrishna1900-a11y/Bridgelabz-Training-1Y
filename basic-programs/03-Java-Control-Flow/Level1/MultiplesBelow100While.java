
import java.util.Scanner;
class MultiplesBelow100While {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number <= 0 || number >= 100) {
            System.out.println("Enter a positive integer less than 100");
            input.close();
            return;
        }
        int i = 100;
        while (i >= 1) {
            if (i % number == 0) {
                System.out.println(i);
            }
            i--;
        }
        input.close();
    }
}
