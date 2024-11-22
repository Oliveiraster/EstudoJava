package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
  //atributo
  private Map<String, Integer> agendaContatoMap;

  public AgendaContatos() {
    this.agendaContatoMap = new HashMap<>();
  }

  public void adicionarContato(String nome, Integer tell) {
    agendaContatoMap.put(nome, tell); // caso exista 2 contatos com nome iguais prevalecera o ultimo contato salvo 
  }

  public void removerContato(String nome) {
    if (!agendaContatoMap.isEmpty()) {
      agendaContatoMap.remove(nome);
    } else {
      System.out.println("A agenda está vazia.");
    }
  }

  public void exibirContatos() {
    if (!agendaContatoMap.isEmpty()) {
      System.out.println(agendaContatoMap);
    } else {
      System.out.println("A agenda está vazia.");
    }
  }

  public Integer pesquisarPorNome(String nome) {
    Integer numeroPorNome = null;
    if (!agendaContatoMap.isEmpty()) {
      numeroPorNome = agendaContatoMap.get(nome);
      if (numeroPorNome == null) {
        System.out.println("Contato não encontrado.");
      }
    } else {
      System.out.println("A agenda está vazia.");
    }
    return numeroPorNome;
  }

  public static void main(String[] args) {
    AgendaContatos agendaContatos = new AgendaContatos();

    // Adicionar contatos
    agendaContatos.adicionarContato("Raphael", 143435);
    agendaContatos.adicionarContato("Raphael Oliveira", 999068501);
    agendaContatos.adicionarContato("Jefferson", 11456111);
    agendaContatos.adicionarContato("Jefferson Oliveira", 654987);
    agendaContatos.adicionarContato("Raphael Jefferson", 13356111);
    agendaContatos.adicionarContato("Carlos", 5423254);

    agendaContatos.exibirContatos();

    // Remover um contato
    agendaContatos.removerContato("Carlos");
    agendaContatos.exibirContatos();

    // Pesquisar número por nome
    String nomePesquisa = "Raphael Oliveira";
    Integer numeroPesquisa = agendaContatos.pesquisarPorNome("Raphael Oliveira");
    System.out.println("Número de telefone de " + nomePesquisa + ": " + numeroPesquisa);

    String nomePesquisaNaoExistente = "Raphael";
    Integer numeroPesquisaNaoExistente = agendaContatos.pesquisarPorNome(nomePesquisaNaoExistente);
    System.out.println("Número de telefone de " + nomePesquisaNaoExistente + ": " + numeroPesquisaNaoExistente);
  }
}