package br.com.oopII.instrutoresVoluntarios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class InstrutorRepository {
    private static List<Instrutor> nomeInstrutor = new ArrayList<>();

    public void Anuncio() {

        System.out.println("Olá, escolha o que quer aprender:");
    }

    public void adicionarInstrutor(Instrutor instrutor) {
        nomeInstrutor.add(instrutor);
       System.out.println(instrutor.habilidade);
    }

    public static List<Instrutor> getNomeInstrutor() {
        return nomeInstrutor;
    }

    public void Escolha() {
        Scanner sc = new Scanner(System.in);
        String escolhaInstrutor = sc.nextLine();

        if(nomeInstrutor.contains(escolhaInstrutor)){
            System.out.println(nomeInstrutor);
        }

    }
}


