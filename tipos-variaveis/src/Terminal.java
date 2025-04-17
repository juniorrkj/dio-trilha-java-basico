import java.util.Scanner;

public class Terminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exibe uma mensagem no terminal
        System.out.println("Digite seu nome:");

        // Lê a entrada do usuário
        String nome = scanner.nextLine();

        // Exibe uma mensagem personalizada
        System.out.println("Olá, " + nome + "! Bem-vindo ao programa.");

        // Fecha o scanner
        scanner.close();
    }
}