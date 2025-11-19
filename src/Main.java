import br.com.ProjetoAlura.OrbitStream.modelos.Filmes;
import br.com.ProjetoAlura.OrbitStream.modelos.Series;

public class Main {
    static void main(String[] args) {
        Filmes meuFilme = new Filmes();
        meuFilme.setNomeDoTitulo("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1972);
        meuFilme.setIncluidoNoPlano(true);
        meuFilme.setDuracaoEmMinutos(177);
        System.out.println("Duração do Filme: " +meuFilme.getDuracaoEmMinutos());

        meuFilme.demonstraFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(7.5);
        meuFilme.avalia(9);
        meuFilme.avalia(10);

        System.out.println("Quantidade de avaliações: " +meuFilme.getTotalDeAvaliacoes());
        System.out.println("Nota média: " +meuFilme.calculaMedia());


        Series Serie_cod001_Rick_And_Morty = new Series();
        Serie_cod001_Rick_And_Morty.setNomeDoTitulo("Rick And Morty");
        Serie_cod001_Rick_And_Morty.setAnoDeLancamento(2013);
        Serie_cod001_Rick_And_Morty.setDuracaoEmMinutos(23);
        Serie_cod001_Rick_And_Morty.setMinutosPorEpisodio(23);
        Serie_cod001_Rick_And_Morty.demonstraFichaTecnica();

        Serie_cod001_Rick_And_Morty.setTemporadas(8);
        Serie_cod001_Rick_And_Morty.setEpisodiosPorTemporada(11);
        System.out.println("Duração em minutos série completa: " +Serie_cod001_Rick_And_Morty.getDuracaoEmMinutos());
    }
}
