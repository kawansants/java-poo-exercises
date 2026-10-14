package application;
import java.util.Scanner;
import entities.Bill;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Bill bill = new Bill();

        System.out.println("Informe seu gênero: M - masculino, F feminimo: ");
        bill.gender = sc.next().charAt(0);

        while (bill.gender != 'M' && bill.gender != 'F' ){
            System.out.println("Informe M ou F");
            bill.gender = sc.next().charAt(0);
        }

        System.out.println("Informe a quantidade de cervejas: ");
        bill.beer = sc.nextInt();
        while (bill.beer < 0){
            System.out.println("Por favor, informe um valor válido! ");
            bill.beer = sc.nextInt();
        }

        System.out.println("Informe a quantidade de refrigerantes: ");
        bill.softDrink = sc.nextInt();
        while (bill.softDrink < 0){
            System.out.println("Por favor, informe um valor válido! ");
            bill.softDrink = sc.nextInt();
        }

        System.out.println("Informe a quantidade de espetinhos: ");
        bill.barbecue = sc.nextInt();
        while (bill.barbecue < 0){
            System.out.println("Por favor, informe um valor válido! ");
            bill.barbecue = sc.nextInt();
        }

        System.out.println("RELATORIO");
        System.out.printf("Consumo R$%.2f%n", bill.feeding());
        System.out.printf("Cover R$%.2f%n", bill.cover());
        System.out.printf("Ingresso R$%.2f%n", bill.ticket());
        System.out.printf("Total R$%.2f%n", bill.total());

        sc.close();

    }
}

