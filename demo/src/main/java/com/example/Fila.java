package com.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class Fila {
    private Queue<Pessoa> clientes;
    private ArrayList<Sessao> sessoes;

    public Fila(){
        this.clientes = new LinkedList<Pessoa>();
        this.sessoes = new ArrayList<Sessao>();
    }

    public void addCliente(Pessoa cliente){
        this.clientes.add(cliente);
    }

    public void addSessao(Sessao sessao){
        this.sessoes.add(sessao);
    }

    public Queue<Pessoa> getClientes() {
        return clientes;
    }

    public ArrayList<Sessao> getSessoes() {
        return sessoes;
    }
}
