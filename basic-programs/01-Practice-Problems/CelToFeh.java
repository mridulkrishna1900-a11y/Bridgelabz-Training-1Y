import java.util.Scanner;

public class CelToFeh{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Temperature in Cel : ");
        double Cel = input.nextDouble();

        System.out.print("Result in Feh : ");
        double feh = (Cel* 9/5) + 32;

        System.out.print(feh);
        input.close();
    }
}