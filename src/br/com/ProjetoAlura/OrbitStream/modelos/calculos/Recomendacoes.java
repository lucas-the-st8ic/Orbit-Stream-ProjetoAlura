package br.com.ProjetoAlura.OrbitStream.modelos.calculos;

public class Recomendacoes {
    private String recomendacao;

    public void filtra(Classificacoes classificacoes){
        if (classificacoes.getclassificacao() >=4) {
            System.out.println("Está entre os mais assistidos no momento.");
        } else if (classificacoes.getclassificacao() >=2) {
            System.out.println("Bem avaliado no momento.");
        } else {
            System.out.println("Assista e dê sua opinião!");
        }
    }
}
