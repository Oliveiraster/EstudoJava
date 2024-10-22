package lanchonet.atendimento.cozinha;

public class Almoxarife {
    private void controlarEntrada(){
        System.out.println("COntrolando a Entrada dos Itens");
    }

    private void controlarSaida(){
        System.out.println("Controlando a saida dos itens");
    }

    public void entregarIngredientes(){
        System.out.println("Entregando Ingredientes");
        controlarSaida();
    }

    public void trocarGas(){
        System.out.println("Almoxarife Trocando o Gas");
    }
}
