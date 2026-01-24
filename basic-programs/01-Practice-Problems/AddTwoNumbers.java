import java.util.Scanner;

public class AddTwoNumbers{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the First number : ");
        double Num1 = input.nextDouble();

        System.out.print("Enter the Second number : ");
        double Num2 = input.nextDouble();

        System.out.print("Sum :");
        double Sum = Num1+Num2;

        System.out.print(Sum);
        input.close();
    }
}