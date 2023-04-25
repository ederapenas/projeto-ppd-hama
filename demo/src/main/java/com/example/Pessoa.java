package com.example;

import java.util.LinkedList;

public class Pessoa {
    private String nome;
    LinkedList<Sessao> filmesVistos;

    public Pessoa(String nome){
        this.nome = nome;
        this.filmesVistos = new LinkedList<Sessao>();
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public LinkedList<Sessao> getFilmesVistos() {
        return filmesVistos;
    }

    public void addFilmesVistos(Sessao filme){
        this.filmesVistos.add(filme);
    }

    public String getNome(){
        return this.nome;
    }

}
