package main;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Livro livro1 = new Livro("Livro A", 1990, 5);
        Livro livro2 = new Livro("Livro B", 2016, 2);
        Livro livro3 = new Livro("Livro C", 1985, 3);
        Livro livro4 = new Livro("Livro D", 2019, 4);
        Livro livro5 = new Livro("Livro E", 2007, 1);

        List<Livro> listaLivros = new ArrayList<>();
        listaLivros.add(livro1);
        listaLivros.add(livro2);
        listaLivros.add(livro3);
        listaLivros.add(livro4);
        listaLivros.add(livro5);

        //imprimir lista sem ordenar
        imprimirListaLivros(listaLivros);

        OrdenadorTemplate ordenador;

        //imprimir lista ordenando por ano
        ordenador = new OrdenadorAno();
        listaLivros = ordenador.ordenarLivro(listaLivros);
        imprimirListaLivros(listaLivros);

        //imprimir lista ordenando por avaliação
        ordenador = new OrdenadorAvaliacao();
        listaLivros = ordenador.ordenarLivro(listaLivros);
        imprimirListaLivros(listaLivros);

    }


    public static void imprimirListaLivros(List<Livro> lista){

        for(int i = 0; i < lista.size(); i++){
            System.out.println(i + " ---- Nome: " + lista.get(i).getNome() +
                                " Ano: " + lista.get(i).getAno() +
                                " Avaliação: " + lista.get(i).getAvaliacao());
        }
        System.out.println("**********************************");
        System.out.println();
    }
}
