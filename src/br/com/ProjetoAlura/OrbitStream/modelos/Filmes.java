package br.com.ProjetoAlura.OrbitStream.modelos;

import br.com.ProjetoAlura.OrbitStream.modelos.calculos.Classificacoes;

public class Filmes extends Titulos implements Classificacoes {

    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getclassificacao() {
        return (int) calculaMedia() / 2;
    }
}
