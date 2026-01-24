import java.util.Scanner;

public class SimpleInterest{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the principle : " );
        double principle = input.nextDouble();

        System.out.print("Enter the rate : ");
        double rate = input.nextDouble();

        System.out.print("Enter the time : ");
        double time = input.nextDouble();

        System.out.print("Simple Interest : ");
        double SI = (principle * rate * time)/100;

        System.out.print(SI);
        input.close();


    }
}