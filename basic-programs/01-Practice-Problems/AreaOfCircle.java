import java.util.Scanner;

public class AreaOfCircle{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
         
         System.out.print("enter the radius: ");
         double rad = input.nextDouble();

         System.out.print("Area of Cirle : ");
         double Area = 3.14 * rad * rad;

         System.out.print(Area);
         input.close();
    }
}