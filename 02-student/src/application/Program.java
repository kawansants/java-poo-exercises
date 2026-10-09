package application;
import java.util.Scanner;
import entities.Student;

public class Program {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.println("Enter the student name: ");
        student.name = sc.nextLine();

        System.out.println("Enter the first note: ");
        student.n1 = sc.nextDouble();

        System.out.println("Enter the second note: ");
        student.n2 = sc.nextDouble();

        System.out.println("Enter the third note: ");
        student.n3 = sc.nextDouble();

        System.out.printf("Final note: %.2f%n", student.finalGrade());

        if (student.isApproved()){
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.printf("MISSING POINTS %.2f%n", student.missingPoints());
        }

        sc.close();

    }
}
