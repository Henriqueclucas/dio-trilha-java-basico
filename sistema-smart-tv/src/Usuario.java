public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Canal atual? " + smartTv.canal);
        System.out.println("Volume da tv? " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Tv ligada? :" + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Tv ligada? : " + smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);


        smartTv.mudarCanal(13);
        System.out.println("Canal atual: " + smartTv.canal);
    }
}
