package main;

import java.util.ArrayList;
import java.util.List;

public abstract class OrdenadorTemplate {

    public abstract boolean isPrimeiro(Livro livroUm, Livro livroDois);

    public List<Livro> ordenarLivro(List<Livro> lista){

        List<Livro> novaLista = new ArrayList<>();

        for(Livro l : lista){
            novaLista.add(l);
        }

        for(int i = 0; i < novaLista.size(); i++){

            for(int j = 0; j < novaLista.size(); j++){
                if (!isPrimeiro(novaLista.get(i), novaLista.get(j))) {

                    Livro temp = novaLista.get(j);
                    novaLista.set(j, novaLista.get(i));
                    novaLista.set(i, temp);
                }
            }
        }
        return novaLista;
    }
}
