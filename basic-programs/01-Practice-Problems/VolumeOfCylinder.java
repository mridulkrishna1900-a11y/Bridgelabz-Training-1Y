import java.util.Scanner;

public class VolumeOfCylinder{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Radius : ");
        double rad = input.nextDouble();

        System.out.print("Enter the Height :");
        double H = input.nextDouble();

        System.out.print("Volume");
        double Volume = 3.14 * rad * rad * H ;

        System.out.print(Volume);
        input.close();
    }
}