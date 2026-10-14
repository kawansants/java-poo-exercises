package application;
import java.util.Scanner;
import entities.Employee;

public class Program {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.println("Enter the Employee name: ");
        employee.name = sc.nextLine();

        System.out.println("Enter the gross salary: ");
        employee.grossSalary = sc.nextDouble();

        System.out.println("Enter the tax: ");
        employee.tax = sc.nextDouble();

        System.out.printf("Employee: %s, $ %.2f%n", employee.name, employee.netSalary());

        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();

        employee.increaseSalary(percentage);

        System.out.printf("Updated data: %s, $ %.2f%n",
                employee.name, employee.netSalary());
        
        sc.close();


    }
}
