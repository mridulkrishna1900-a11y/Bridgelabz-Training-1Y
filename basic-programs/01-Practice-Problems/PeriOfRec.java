import java.util.Scanner;

public class PeriOfRec{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length : " );
        double l = input.nextDouble();

        System.out.print("Enter the breadth : ");
        double b = input.nextDouble();

        System.out.print("Perimeter");
        double Perimeter = 2*(l+b);

        System.out.print(Perimeter);
        input.close();
    }
}