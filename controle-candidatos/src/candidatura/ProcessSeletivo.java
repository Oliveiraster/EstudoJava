package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessSeletivo {
    public static void main(String[] args) {
        String[] candidats = {
            "Felipe",
            "Raphael",
            "Afonso",
            "Oliver",
            "Julio",
            "Lurdes",
            "Cecília",
            "Barth",
            "Maria",
            "Gerlucia" };
            for(String candidato: candidats ){
                entrandoEmContato(candidato);
            }
        }
        
        static boolean atender(){
            return new Random().nextInt(3) == 1;
        }
        
        static void entrandoEmContato(String candidato){
            int tentativasRealizadas = 1 ;
            boolean continuarTentando = true;

            boolean atendeu = false;
            do{
                atendeu = atender();
                continuarTentando = !atendeu;
                if(continuarTentando){
                    tentativasRealizadas++;
                } else{
                    System.out.println("Contato Realizado com sucesso");
                }
            } while(continuarTentando && tentativasRealizadas < 3);
            
            if(atendeu)
                System.out.println("Conseguimos contato com " + candidato  + " na" + tentativasRealizadas + "tentativa");
            
            else 
                System.out.println("Não conseguimos contato com " + candidato + " Numero maximo de tentativas " + tentativasRealizadas);
            }

        static void selecaoDeCandidato(){
            String [] candidatos = {
            "Felipe", 
            "Raphael", 
            "Afonso", 
            "Oliver", 
            "Julio", 
            "Lurdes", 
            "Cecília", 
            "Barth", 
            "Maria", 
            "Gerlucia"};

            int candidatosSelecionados = 0;
            int candidatoAtual = 0;
            double salarioBase = 2000.0;

            while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
                String candidato = candidatos[candidatoAtual];
                double salarioPretendido = valorPretendido();
                
                System.out.println("O candidato " + candidato + " Solicitou este valor de salário " + salarioPretendido);
                if (salarioBase >= salarioPretendido){
                    System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                }

            candidatoAtual++;
            
            }
    }

    static void imprimirSelecionados(){
        String[] candidatos = {
                "Felipe",
                "Raphael",
                "Afonso",
                "Oliver",
                "Julio",
                "Lurdes",
                "Cecília",
                "Barth",
                "Maria",
                "Gerlucia" };
            System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
            
            for(int indice = 0; indice< candidatos.length; indice ++){
                System.out.println("O Candidato de n° " + (indice+1) + " é o " + candidatos[indice] );
            }

            System.out.println("Forma abreviada de interação for each");
            for(String candidato : candidatos){
                System.out.println("O candidato selecionado foi " + candidato);
            }
        }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido ) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido)
            System.out.println("Ligar para o candidato");
        else if (salarioBase == salarioPretendido)
            System.out.println("Ligar para o candidato com contra proposta");
        else 
            System.out.println("Aguardando o resultado dos demais candidatos");
    } 

}
