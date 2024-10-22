package lanchonet.atendimento;

public class Atendente {
    public void servindoMesa(){
        pegarPedidoBalcao();
        System.out.println("Servindo Mesa");
    }

    public void receberPagamento(){
        System.out.println("Recebendo pagamento");
    }

    void trocarGas(){
        System.out.println("Atendente Trocando gás");
    }

    private void pegarPedidoBalcao(){
        System.out.println("Pegando pedido no balcao");
    }
}
