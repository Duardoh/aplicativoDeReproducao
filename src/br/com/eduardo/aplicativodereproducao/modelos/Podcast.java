package br.com.eduardo.aplicativodereproducao.modelos;

public class Podcast extends Audio{
    private String host;
    private String descricao;

    public String getCast() {
        return host;
    }

    public void setCast(String host) {
        this.host = host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int getClassificacao() {
        if (this.getTotalCurtidas() > 500){
            return 10;
        } else {
            return 8;
        }
    }
}
