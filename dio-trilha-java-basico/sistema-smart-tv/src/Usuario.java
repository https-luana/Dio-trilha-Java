public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        
        smartTv.diminuirvolume();
        smartTv.diminuirvolume();
        smartTv.diminuirvolume();
        smartTv.aumentarVolume();

        System.out.println("Canal atual: "+ smartTv.canal);

        smartTv.mudarCanal(13);

        System.out.println("Volume atual? "+ smartTv.volume);

        System.out.println("Tv ligada? "+ smartTv.ligada);

    
    }
}
