public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Canal Atual : " + smartTv.canal);

        smartTv.mudarCanal(13);
        
        System.out.println("Canal Atual : " + smartTv.canal);

        System.out.println("Volume Atual : " + smartTv.volume);

        System.out.println("Tv Ligada ? " + smartTv.Ligada);
        System.out.println("Canal Atual : " + smartTv.canal);
        System.out.println("Volume Atual : " + smartTv.volume);

        smartTv.Ligar();
        System.out.println("Novo Status -> Tv Ligada ? " + smartTv.Ligada);

        smartTv.Desligar();
        System.out.println("Novo Status -> Tv Ligada ? " + smartTv.Ligada);
    }
}
