import java.util.Scanner;

public class PowerCalculation{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base : ");
        double Base = input.nextDouble();

        System.out.print("Enter the exponent : ");
        double exponent = input.nextDouble();

        System.out.print("Power : ");
        double Power = Math.pow(Base,exponent);

        System.out.print(Power);
        input.close();
    }
}