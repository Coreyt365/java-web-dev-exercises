package excercises;
import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles did you drive today? ");
        double miles = input.nextDouble();
        System.out.println("How many gallons of gas did you use? ");
        double gallons = input.nextDouble();
        double milesPerGallon = miles/gallons;
        input.close();
        System.out.println("You are currently getting " + milesPerGallon+ " miles-per-gallon");
    }
}
