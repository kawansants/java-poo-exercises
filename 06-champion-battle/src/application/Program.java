package application;
import entities.Champion;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o nome do jogador:");
        String name = sc.nextLine();

        System.out.println(" Informe a vida do jogador:");
        int life = sc.nextInt();

        System.out.println("Informe o ataque do jogador:");
        int attack = sc.nextInt();

        System.out.println("Informe a armadura do jogador:");
        int armor = sc.nextInt();
        sc.nextLine();

        Champion champion = new Champion(name, life, attack, armor);

        System.out.println("Informe o nome do jogador:");
        String name2 = sc.nextLine();

        System.out.println("Informe a vida do jogador:");
        int life2 = sc.nextInt();

        System.out.println("Informe o ataque do jogador:");
        int attack2 = sc.nextInt();

        System.out.println("Informe a armadura do jogador:");
        int armor2 = sc.nextInt();
        sc.nextLine();

        Champion champion2 = new Champion(name2, life2, attack2, armor2);

        System.out.println("\nInforme quantos turnos terá o jogo:\n");
        int turns = sc.nextInt();

        System.out.println("\nSTATUS INICIAIS\n");
        System.out.println(champion.status());
        System.out.println(champion2.status());

        for (int i = 1; i <= turns; i++){

            System.out.println("Inicio do turno: " + i);

            champion.takeDamage(champion2);
            champion2.takeDamage(champion);

            System.out.println(champion.status());
            System.out.println(champion2.status());

            System.out.println("\nFim do turno: " + i);

            if (champion.getLife() == 0 || champion2.getLife() == 0){
                break;
            }

        }

        System.out.println("\nFIM DO COMBATE\n");

        sc.close();

    }
}
