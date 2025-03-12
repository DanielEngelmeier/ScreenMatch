package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);
        Serie lost = new Serie("Lost",2000);
        Filme outroFilme = new Filme("Avatar", 2003);
        outroFilme.avalia(6);
        var maisUmFilme = new Filme("Dogville", 2003);
        maisUmFilme.avalia(10);

        ArrayList<Titulo> lista = new ArrayList<>();

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
    }
}
