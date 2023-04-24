package com.example;

public class Sessao {
    private String filme;
    private int vagas;
    private int duracao;

    public Sessao(String filme, int vagas, int duracao){
        this.filme = filme;
        this.vagas = vagas;
        this.duracao = duracao;
    }

    public void setFilme(String filme) {
        this.filme = filme;
    }

    public void setVagas(int vagas) {
        this.vagas = vagas;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getFilme() {
        return filme;
    }

    public int getVagas() {
        return vagas;
    }
    
    public int getDuracao() {
        return duracao;
    }

    public void exibir(){
        
    }
}
