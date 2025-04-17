public class Escopo {

    // Variável de instância
    private int idade;

    // Variável estática
    private static int contador = 0;

    // Método para demonstrar escopo de variável local
    public void exemploLocal() {
        int x = 10; // Variável local
        System.out.println("Valor de x: " + x); // Acessível aqui
    }

    // Método para demonstrar escopo de variável de instância
    public void setIdade(int idade) {
        this.idade = idade; // Usando "this" para diferenciar a variável de instância
    }

    public int getIdade() {
        return idade; // Acessível em qualquer método da classe
    }

    // Método para demonstrar escopo de variável estática
    public static void incrementar() {
        contador++;
    }

    public static int getContador() {
        return contador; // Acessível por métodos estáticos
    }

    // Método para demonstrar escopo de bloco
    public void exemploBloco() {
        if (true) {
            int y = 20; // Escopo limitado ao bloco if
            System.out.println("Valor de y: " + y);
        }
        // System.out.println(y); // Erro: y não é acessível fora do bloco
    }
}