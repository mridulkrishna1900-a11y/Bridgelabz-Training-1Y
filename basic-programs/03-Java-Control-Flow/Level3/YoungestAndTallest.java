
import java.util.Scanner;
class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ageA = input.nextInt();
        int ageB = input.nextInt();
        int ageC = input.nextInt();
        double heightA = input.nextDouble();
        double heightB = input.nextDouble();
        double heightC = input.nextDouble();
        int minAge = ageA;
        String youngest = "Amar";
        if (ageB < minAge) {
            minAge = ageB;
            youngest = "Akbar";
        }
        if (ageC < minAge) {
            minAge = ageC;
            youngest = "Anthony";
        }
        double maxHeight = heightA;
        String tallest = "Amar";
        if (heightB > maxHeight) {
            maxHeight = heightB;
            tallest = "Akbar";
        }
        if (heightC > maxHeight) {
            maxHeight = heightC;
            tallest = "Anthony";
        }
        System.out.println("Youngest friend: " + youngest + " with age " + minAge);
        System.out.println("Tallest friend: " + tallest + " with height " + maxHeight);
        input.close();
    }
}
