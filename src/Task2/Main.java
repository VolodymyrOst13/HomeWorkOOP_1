package Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner hw = new Scanner(System.in);
        Rectangle rectangle1 = new Rectangle();

        System.out.print("Enter the side1 size - ");
        rectangle1.side1 = hw.nextDouble();
        System.out.print("Enter the side2 size - ");
        rectangle1.side2 = hw.nextDouble();

        System.out.println("The area of rectangle is - " + rectangle1.area() + "\n" +
                "The perimeter of rectangle is - " + rectangle1.perimeter());


    }
}
