package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);
        Serie lost = new Serie("Lost",2000);
        Filme outroFilme = new Filme("Avatar", 2003);
        outroFilme.avalia(6);
        var maisUmFilme = new Filme("Dogville", 2003);
        maisUmFilme.avalia(10);

        List<Titulo> lista = new ArrayList<>();

        lista.add(maisUmFilme);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        for (Titulo item: lista){
            System.out.println(item);
            if(item instanceof Filme filme){
                System.out.println("Classificacao: " + filme.getClassificacao());
            }

        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Daniel");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Bianca");

        Collections.sort(buscaPorArtista);
        System.out.println(buscaPorArtista);

        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(lista);
    }
}
