package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Rectangle;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.print("Enter the rectangle width: ");
        rectangle.width = sc.nextDouble();

        System.out.print("Enter the rectangle height: ");
        rectangle.height = sc.nextDouble();

        System.out.printf("Area = %.2f%n", rectangle.area());
        System.out.printf("Perimeter = %.2f%n", rectangle.perimeter());
        System.out.printf("Diagonal = %.2f%n", rectangle.diagonal());

        sc.close();
    }
}
