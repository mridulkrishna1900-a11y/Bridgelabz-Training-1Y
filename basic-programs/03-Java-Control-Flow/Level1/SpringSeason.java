
import java.util.Scanner;
class SpringSeason {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month = input.nextInt();
        int day = input.nextInt();
        boolean isSpring = false;
        if (month < 3 || month > 6) {
            isSpring = false;
        } else if (month == 3) {
            isSpring = (day >= 20);
        } else if (month == 6) {
            isSpring = (day <= 20);
        } else {
            isSpring = true;
        }
        if (isSpring) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
        input.close();
    }
}
