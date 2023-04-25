package com.example;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public final class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);
        int qtdPessoas, qtdSessoes, qtdBilheterias;
        Queue<Pessoa> fila = new LinkedList<Pessoa>();
        LinkedList<Sessao> sessoes = new LinkedList<Sessao>();

        System.out.println("Informe a quantidade de clientes que você deseja criar: ");
        qtdPessoas = input.nextInt();
        System.out.println("Informe a quantidade de bilheteirias que você deseja criar: ");
        qtdBilheterias = input.nextInt();
        System.out.println("Informe a quantidade de sessoes que você deseja criar: ");
        qtdSessoes = input.nextInt();

        for(int i = 0; i <= qtdPessoas; i++){
            System.out.println("Informe o nome da pessoa " + i + ":");
            String nome = inputString.nextLine();
            Pessoa pessoa = new Pessoa(nome);
            fila.add(pessoa);
        }

        for(int i = 0; i <= qtdSessoes; i++){
            System.out.println("Informe o nome do filme da sessão" + i + ":");
            String nomeFilme = inputString.nextLine();
            System.out.println("Informe a quantidade de vagas para a sessão " + i + ":");
            int vagas = input.nextInt();
            System.out.println("Informe a duração de segundos que vocÊ queira que demore para o filme terminar: ");
            int duracao = input.nextInt();
            Sessao sessao = new Sessao(nomeFilme, vagas, duracao);
            sessoes.add(sessao);
        }
    }
}
