public class Operadores {
    public static void main(String[] args) {
        // Operadores Aritméticos
        int soma = 10 + 5;
        int subtracao = 10 - 5;
        int multiplicacao = 10 * 5;
        int divisao = 10 / 5;
        int modulo = 10 % 3;

        System.out.println("Aritméticos:");
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Módulo: " + modulo);

        // Operadores Relacionais
        boolean maior = 10 > 5;
        boolean menor = 10 < 5;
        boolean maiorOuIgual = 10 >= 5;
        boolean menorOuIgual = 10 <= 5;
        boolean igual = 10 == 5;
        boolean diferente = 10 != 5;

        System.out.println("\nRelacionais:");
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Maior ou Igual: " + maiorOuIgual);
        System.out.println("Menor ou Igual: " + menorOuIgual);
        System.out.println("Igual: " + igual);
        System.out.println("Diferente: " + diferente);

        // Operadores Lógicos
        boolean e = (10 > 5) && (5 < 10);
        boolean ou = (10 > 5) || (5 > 10);
        boolean nao = !(10 > 5);

        System.out.println("\nLógicos:");
        System.out.println("E (&&): " + e);
        System.out.println("OU (||): " + ou);
        System.out.println("NÃO (!): " + nao);

        // Operadores de Atribuição
        int numero = 10;
        numero += 5; // equivalente a numero = numero + 5
        numero -= 3; // equivalente a numero = numero - 3
        numero *= 2; // equivalente a numero = numero * 2
        numero /= 2; // equivalente a numero = numero / 2
        numero %= 3; // equivalente a numero = numero % 3

        System.out.println("\nAtribuição:");
        System.out.println("Resultado: " + numero);

        // Operadores Unários
        int positivo = +10;
        int negativo = -10;
        int incremento = 10;
        int decremento = 10;

        incremento++; // incremento = incremento + 1
        decremento--; // decremento = decremento - 1

        System.out.println("\nUnários:");
        System.out.println("Positivo: " + positivo);
        System.out.println("Negativo: " + negativo);
        System.out.println("Incremento: " + incremento);
        System.out.println("Decremento: " + decremento);

        // Operador Ternário
        int a = 10, b = 5;
        String resultado = (a > b) ? "A é maior que B" : "A não é maior que B";

        System.out.println("\nTernário:");
        System.out.println("Resultado: " + resultado);
    }
}