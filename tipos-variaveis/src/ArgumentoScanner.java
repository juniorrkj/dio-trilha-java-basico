import java.util.Locale;
import java.util.Scanner;

public class ArgumentoScanner {
    public static void main(String[] args) {
        //criando o objeto scanner
        Scanner ArgumentoScanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome");
        String nome = ArgumentoScanner.next();
        
        System.out.println("Digite seu sobrenome");
        String sobrenome = ArgumentoScanner.next();

        System.out.println("Digite sua idade");
        int idade = ArgumentoScanner.nextInt();
        
        System.out.println("Digite sua altura");
        double altura = ArgumentoScanner.nextDouble();

        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
        
        
    }
}