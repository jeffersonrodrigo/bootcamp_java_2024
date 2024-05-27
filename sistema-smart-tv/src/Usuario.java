

public class Usuario {
    public static void main(String[] args) throws Exception {
        smartTv smartTV = new smartTv();

        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.aumentarVolume();
        System.out.println("Volume atual: "+ smartTV.volume);

        System.out.println("TV ligada? "+ smartTV.ligada);
        System.out.println("Canal atual: "+ smartTV.canal);
        System.out.println("Volume atual: "+ smartTV.volume);
        
        smartTV.ligar();
        System.out.println("Novo estado -> Tv ligada? " + smartTV.ligada);
        
        smartTV.desligar();
        System.out.println("Novo estado -> Tv ligada? " + smartTV.ligada);
        
        smartTV.mudarCanal(14);
        
        System.out.println("Canal atual: "+ smartTV.canal);
    }
}
