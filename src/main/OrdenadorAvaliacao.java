package main;

public class OrdenadorAvaliacao extends OrdenadorTemplate{

    @Override
    public boolean isPrimeiro(Livro livroUm, Livro livroDois) {

        if (livroUm.getAvaliacao() > livroDois.getAvaliacao())
        {
            return true;
        }
        return false;
    }
}
