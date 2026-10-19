
import java.util.Scanner;

public class MenuSistema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Continuar");
            System.out.println("2 - Sair");
            System.out.print("Escolha uma opcao: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.print("Digite uma palavra ou frase: ");
                String frase = scanner.nextLine();

                System.out.println("Voce digitou: " + frase);

            } else if (opcao == 2) {
                System.out.println(
                        "Obrigado por utilizar o nosso sistema, espero que tenha gostado."
                );

            } else {
                System.out.println("Opcao invalida. Tente novamente.");
            }

        } while (opcao != 2);

        scanner.close();
    }
}

