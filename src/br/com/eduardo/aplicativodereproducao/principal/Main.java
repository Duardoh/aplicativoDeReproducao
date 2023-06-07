package br.com.eduardo.aplicativodereproducao.principal;

import br.com.eduardo.aplicativodereproducao.modelos.Musicas;
import br.com.eduardo.aplicativodereproducao.modelos.Podcast;
import br.com.eduardo.aplicativodereproducao.modelos.Preferidas;

public class Main {
    public static void main(String[] args) {
        Musicas musica1 = new Musicas();
        musica1.setTitulo("Karma");
        musica1.setCantor("Taylor Swift");

        for (int i = 0; i < 1000; i++){
            musica1.reproduz();
        }
        for (int i = 0; i < 50; i++){
            musica1.curte();
        }

        Podcast pod1 = new Podcast();
        pod1.setTitulo("Olá, Gabs");
        pod1.setCast("Gabs Ferreira");

        for (int i = 0; i < 5000; i++){
            pod1.reproduz();
        }

        for (int i = 0; i < 1000; i++){
            pod1.curte();
        }
        Preferidas preferidas = new Preferidas();
        preferidas.inclui(pod1);
        preferidas.inclui(musica1);
    }
}