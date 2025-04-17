public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.desligar();

        smartTv.aumentarVolume();
    
        smartTv.mudarCanal(12);

        System.out.println("TV ligada?: " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);
    }
}
