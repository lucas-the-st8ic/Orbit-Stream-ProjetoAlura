package br.com.ProjetoAlura.OrbitStream.modelos.Main;

import br.com.ProjetoAlura.OrbitStream.modelos.classes.Filmes;
import br.com.ProjetoAlura.OrbitStream.modelos.classes.Series;
import br.com.ProjetoAlura.OrbitStream.modelos.classes.Titulos;

import java.util.ArrayList;
import java.util.Collections;

public class ListaDeTitulos {
    static void main(String[] args) {
        Filmes filme_cod001 = new Filmes("O Poderoso Chefão", 1972);
        filme_cod001.avalia(10);
        Filmes filme_cod002 = new Filmes("Avatar", 2009);
        filme_cod002.avalia(8.5);
        Filmes filme_cod003 = new Filmes("Tróia", 2004);
        filme_cod003.avalia(7.9);
        Series Serie_cod001_Rick_And_Morty = new Series("Rick And Morty", 2013);



        ArrayList<Titulos> coletaneaDeTitulos = new ArrayList<>();
        coletaneaDeTitulos.add(filme_cod001);
        coletaneaDeTitulos.add(filme_cod002);
        coletaneaDeTitulos.add(Serie_cod001_Rick_And_Morty);

        for (Titulos titulo : coletaneaDeTitulos) {
            System.out.println(titulo.getNomeDoTitulo());
            if(titulo instanceof Filmes filme && filme.getclassificacao() > 2){
                System.out.println("Classificação " +filme.getclassificacao());
            }

        }

        ArrayList<String> coletaneaDeartistas = new ArrayList<>();
        coletaneaDeartistas.add("Johnny Depp ");
        coletaneaDeartistas.add("Jason Momoa ");
        coletaneaDeartistas.add("Leonardo DiCaprio ");
        coletaneaDeartistas.add("Brad Pitt ");
        coletaneaDeartistas.add("Al Pacino ");
        coletaneaDeartistas.add("Clint Eastwood ");
        coletaneaDeartistas.add("Marlon Brando ");
        coletaneaDeartistas.add("Liam Neeson ");
        coletaneaDeartistas.add("Keanu Reeves ");

        System.out.println(coletaneaDeartistas);

        Collections.sort(coletaneaDeartistas);

        System.out.println("Filtro por ordem Alfabética: ");
        System.out.println(coletaneaDeartistas);


        System.out.println(coletaneaDeTitulos);
        Collections.sort(coletaneaDeTitulos);
        System.out.println("Filtro de filmes e séries por ordem alfabética: ");
        System.out.println(coletaneaDeTitulos);
    }
}
