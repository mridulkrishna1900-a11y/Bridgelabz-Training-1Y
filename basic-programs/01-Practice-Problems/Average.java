import java.util.Scanner;

public class Average{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number :");
        double Num1 = input.nextDouble();

        System.out.print("Enter the second number :");
        double Num2 = input.nextDouble();

        System.out.print("Enter the third number :");
        double Num3 = input.nextDouble();

        System.out.print("Average :");
        double Average = (Num1+Num2+Num3)/3;

        System.out.print(Average);
        input.close();
    }
}
