package br.com.oopII.instrutoresVoluntarios;

public class Instrutor extends Morador{
    String habilidade;

    public Instrutor(String nome, String endereco, String numeroTelefoneCelular, String habilidade) {
        this.nome = nome;
        this.endereco = endereco;
        this.numeroTelefoneCelular = numeroTelefoneCelular;
        this.habilidade = habilidade;

    }

    @Override
    public String toString() {
        return "Instrutor{" +
                "habilidade='" + habilidade + '\'' +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", numeroTelefoneCelular='" + numeroTelefoneCelular + '\'' +
                '}';
    }
}
