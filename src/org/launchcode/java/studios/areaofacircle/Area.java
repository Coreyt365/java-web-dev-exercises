package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;
public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of your circle:");
        while(  !input.hasNextInt()){
            input.next();
            System.out.println("Please enter an integer: ");
        }

        double radius = input.nextDouble();
        while (radius <= 0){
            System.out.println("Please enter a positive integer: ");
            radius = input.nextDouble();
        }
        double area =Circle.getArea(radius);

        System.out.println("Your circle area is "+ area);
        input.close();
    }
}
