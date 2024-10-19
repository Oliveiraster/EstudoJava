public class BoletimEstudantil {
    
    public static void main(String[] args) {
        int mediaFinal = 6;
        if (mediaFinal < 6) 
            System.out.print("REPROVADO");
        else if (mediaFinal == 6) 
            System.out.print("Prova Minerva");
        else 
            System.out.print("APROVADO");
    }
}
