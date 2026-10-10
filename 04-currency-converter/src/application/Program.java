package application;
import java.util.Scanner;
import entities.CurrencyConverter;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o valor do dólar: ");
        double dollarPrice = sc.nextDouble();

        System.out.print("Quantos dólares serão comprados? ");
        double amount = sc.nextDouble();

        System.out.printf("O valor comprado será de %.2f%n", CurrencyConverter.converter(dollarPrice, amount));

        sc.close();
    }
}

