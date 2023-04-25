package com.example;

import java.util.LinkedList;
import java.util.Queue;

public class Cinema {
    private Queue<Pessoa> fila;
    private LinkedList<Sessao> filmes;
    private LinkedList<Bilheteria> bilheterias;
    
    public Cinema(Queue<Pessoa> fila, LinkedList<Sessao> filmes, LinkedList<Bilheteria>bilheterias){
        this.fila = fila;
        this.filmes = filmes;
        this.bilheterias = bilheterias;
    }

    public Queue<Pessoa> getFila() {
        return fila;
    }

    public LinkedList<Sessao> getFilmes() {
        return filmes;
    }

    public LinkedList<Bilheteria> getBilheterias() {
        return bilheterias;
    }

    public void setFila(Queue<Pessoa> fila) {
        this.fila = fila;
    }

    public void setFilmes(LinkedList<Sessao> filmes) {
        this.filmes = filmes;
    }

    public void setBilheterias(LinkedList<Bilheteria> bilheterias) {
        this.bilheterias = bilheterias;
    }

    public void abrirCinema(){
        //iniciar o paralelismo nas bilheterias para receber as pessoas na fila, e coloca-las para ver os filmes.
        //iniciar o paralelismo nas sessões para colocar as pessoas para dormir por X segundos (exibição do filme)
        //os clientes vão ficar indo e voltando nas sessões ate que vejam todos os filmes.
    }
}
