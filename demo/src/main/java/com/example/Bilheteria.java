package com.example;

import java.util.LinkedList;
import java.util.Queue;


public class Bilheteria {
    private Queue<Pessoa> fila;
    private LinkedList<Sessao> sessoes;
    private int numero;

    public Bilheteria(int numero){
        this.numero = numero;
        this.fila = new LinkedList<Pessoa>();
        this.sessoes = new LinkedList<Sessao>();
    }

    public void addCliente(Pessoa cliente){
        this.fila.add(cliente);
    }

    public void addSessao(Sessao sessao){
        this.sessoes.add(sessao);
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setFila(Queue<Pessoa> fila) {
        this.fila = fila;
    }

    public void setSessoes(LinkedList<Sessao> sessoes) {
        this.sessoes = sessoes;
    }

    public Queue<Pessoa> getFila() {
        return fila;
    }

    public LinkedList<Sessao> getSessoes() {
        return sessoes;
    }

    public int getNumero() {
        return numero;
    }
    
    public void atender(){
        //designa os clientes para os filme, baseado nos filmes que eles não viram ainda.
    }

}
