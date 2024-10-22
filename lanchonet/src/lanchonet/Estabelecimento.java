package lanchonet;

import lanchonet.area.cliente.Cliente;
import lanchonet.atendimento.Atendente;
import lanchonet.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String [] args){
        Cozinheiro cozinheiro = new Cozinheiro();
        
        cozinheiro.adicionarSucoBalcalcão();
        cozinheiro.adicionarLancheNoBalcalcão();
        cozinheiro.adicionarComboNoBalcalcão();

        Atendente atendente = new Atendente();
        atendente.servindoMesa();
        
        atendente.receberPagamento();

        Cliente cliente = new Cliente();
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();

    }
}
