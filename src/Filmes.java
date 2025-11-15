public class Filmes {

    String nomeDoFilme;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;


    void demonstraFichaTecnica () {
        System.out.println("FILME: " +nomeDoFilme);
        System.out.println("ANO DE LANÇAMENTO: " +anoDeLancamento);
        System.out.println("DURAÇÃO(minutos): " +duracaoEmMinutos);
    }

    void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes ++;
    }
}
