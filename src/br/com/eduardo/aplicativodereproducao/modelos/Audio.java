package br.com.eduardo.aplicativodereproducao.modelos;

//Superclasse br.com.eduardo.aplicativodereproducao.modelos.Audio para as classes br.com.eduardo.aplicativodereproducao.modelos.Podcast e br.com.eduardo.aplicativodereproducao.modelos.Musicas
public class Audio {
    private String titulo;
    private int totalDeReproducoes;
    private int totalCurtidas;
    private int classificacao;

    //Metodos

    // Ao clicar em curtir vai somar o valor
    public void curte(){
        this.totalCurtidas++;
    }

    public void reproduz(){
        this.totalDeReproducoes++;
    }
    public void exibeFichaTecnica(){
        System.out.println("Nome: " + titulo);
        System.out.println("Numero de reproduções: " +totalDeReproducoes);
        System.out.println("Quantidade de curtidas: " + totalCurtidas);
        System.out.println("Classificação: " + classificacao);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }
}

