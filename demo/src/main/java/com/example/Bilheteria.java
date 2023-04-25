package com.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class Bilheteria {
    private Queue<Pessoa> fila;
    private ArrayList<Sessao> sessoes;

    public Bilheteria(){
        this.fila = new LinkedList<Pessoa>();
        this.sessoes = new ArrayList<Sessao>();
    }

    public void addCliente(Pessoa cliente){
        this.fila.add(cliente);
    }

    public void addSessao(Sessao sessao){
        this.sessoes.add(sessao);
    }

    public Queue<Pessoa> getFila() {
        return fila;
    }

    public ArrayList<Sessao> getSessoes() {
        return sessoes;
    }
}
