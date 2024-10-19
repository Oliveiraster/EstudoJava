public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada? " + smartTv.ligada); 
        System.out.println("Volume atual? " + smartTv.volume);
        System.out.println("Canal Atual? " + smartTv.canal);

        smartTv.ligar();
        System.out.println("Tv ligada ? " + smartTv.ligada);
        
        smartTv.desligar();
        System.out.println("Tv ligada ? " + smartTv.ligada);
    }
}
