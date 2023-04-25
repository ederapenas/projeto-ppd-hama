package com.example;

import java.util.LinkedList;

public class Sessao {
    private String filme;
    private int vagas;
    private int duracao;
    LinkedList<Pessoa> espectadores = new LinkedList<Pessoa>();

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

    public void setEspectadores(LinkedList<Pessoa> espectadores) {
        if(this.espectadores.size() < this.vagas){
            this.espectadores = espectadores;
        }
        else{
            return;
        }
    }

    public LinkedList<Pessoa> getEspectadores() {
        return espectadores;
    }

    public void addEspectador(Pessoa espectador){
        this.espectadores.add(espectador);
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
        while(espectadores.size() != this.vagas){
            //poe para sleep enquanto não estiver cheio, quando estiver, exibe o filme
        }
        //colocar os espectadores em sleep por um um tempo
        for(int i = 0; i <= espectadores.size(); i++){
            this.espectadores.get(i).addFilmesVistos(this);
        }
        this.espectadores.clear();
    }
}
