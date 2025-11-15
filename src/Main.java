public class Main {
    static void main(String[] args) {
        Filmes meuFilme = new Filmes();
        meuFilme.nomeDoFilme = "O poderoso chefão";
        meuFilme.anoDeLancamento = 1972;
        meuFilme.incluidoNoPlano = true;
        meuFilme.duracaoEmMinutos = 177;


        meuFilme.demonstraFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(7.5);
        meuFilme.avalia(9);
        meuFilme.avalia(10);

        System.out.println("Quantidade de avaliações: " +meuFilme.totalDeAvaliacoes);
        System.out.println("Soma das avaliações: " +meuFilme.somaDasAvaliacoes);
    }
}
