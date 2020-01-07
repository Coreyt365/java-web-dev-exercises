package excercises;
import java.util.Scanner;
public class AreaRectangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of your rectangle:");
        double length = input.nextDouble();
        System.out.println("Enter the width of your rectangle:");
        double width = input.nextDouble();
        input.close();
        double area = length*width;
        System.out.println("The area of your rectangle is "+ area);

    }
}
