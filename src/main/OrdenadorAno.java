package main;

public class OrdenadorAno extends OrdenadorTemplate {

    @Override
    public boolean isPrimeiro(Livro livroUm, Livro livroDois) {

        if (livroUm.getAno() > livroDois.getAno()) {
            return true;
        }
        return false;
    }
}
