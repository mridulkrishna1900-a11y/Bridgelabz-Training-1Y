import java.util.Scanner;

public class KiloToMiles{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Kilometers :");
        double Kilometers = input.nextDouble();

        System.out.print("Miles :");
        double Miles = Kilometers * 0.621371;

        System.out.print(Miles);
        input.close();
    }
}