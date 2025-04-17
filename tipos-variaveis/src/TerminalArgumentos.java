public class TerminalArgumentos {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Nenhum argumento foi passado!");
        } else {
            System.out.println("Argumentos recebidos:");
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argumento " + (i + 1) + ": " + args[i]);
            }
        }
    }
}