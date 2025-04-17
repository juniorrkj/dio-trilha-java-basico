public class Metodos {

    // Método sem retorno e sem parâmetros
    public void imprimirMensagem() {
        System.out.println("Olá, este é um método sem retorno e sem parâmetros!");
    }

    // Método com retorno e sem parâmetros
    public int obterNumero() {
        return 42;
    }

    // Método sem retorno e com parâmetros
    public void exibirMensagem(String mensagem) {
        System.out.println("Mensagem: " + mensagem);
    }

    // Método com retorno e com parâmetros
    public int somar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Metodos metodos = new Metodos();

        // Chamando método sem retorno e sem parâmetros
        metodos.imprimirMensagem();

        // Chamando método com retorno e sem parâmetros
        int numero = metodos.obterNumero();
        System.out.println("Número obtido: " + numero);

        // Chamando método sem retorno e com parâmetros
        metodos.exibirMensagem("Este é um exemplo de método com parâmetro.");

        // Chamando método com retorno e com parâmetros
        int resultado = metodos.somar(10, 20);
        System.out.println("Resultado da soma: " + resultado);
    }
}