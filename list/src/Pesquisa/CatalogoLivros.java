package Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros(){
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()){
            for (Livro l : livroList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisaPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntrevaloAnos = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntrevaloAnos.add(l);
                }
            }
        }

        return livrosPorIntrevaloAnos;
    }

    public Livro pesquisaPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if (l.getTitutlo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        
        catalogoLivros.adicionarLivro("Cartas Para Você", "imaginart", 2005);
        catalogoLivros.adicionarLivro("Uma Carta Escrita", "ImagineTu", 2000);
        catalogoLivros.adicionarLivro("Um dia de programador", "falsamodestia", 2020);
        catalogoLivros.adicionarLivro("Um dia para programador", "falsamodestia", 2022);
        catalogoLivros.adicionarLivro("Desistindo de programar", "falsamodestia", 2024);

        System.out.println(catalogoLivros.pesquisaPorIntervaloAnos(2000, 2020));
        System.out.println(catalogoLivros.pesquisarPorAutor("falsamodestia"));
    }
}
