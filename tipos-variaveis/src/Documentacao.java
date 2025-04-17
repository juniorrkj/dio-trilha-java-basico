/**
 * Classe de exemplo para o exercício sobre documentação em Java.
 * 
 * Esta classe demonstra como utilizar comentários de documentação
 * para descrever o propósito e o funcionamento de classes, métodos
 * e atributos.
 * 
 * @author SeuNome
 * @version 1.0
 * @since 2023
 */
public class Documentacao {

    /**
     * Este é o método principal que inicia a execução do programa.
     * 
     * @param args Argumentos de linha de comando.
     */
    public static void main(String[] args) {
        System.out.println("Exemplo de documentação em Java!");
    }

    /**
     * Método que realiza uma saudação personalizada.
     * 
     * @param nome Nome da pessoa a ser saudada.
     * @return Uma mensagem de saudação.
     */
    public String saudar(String nome) {
        return "Olá, " + nome + "!";
    }
}