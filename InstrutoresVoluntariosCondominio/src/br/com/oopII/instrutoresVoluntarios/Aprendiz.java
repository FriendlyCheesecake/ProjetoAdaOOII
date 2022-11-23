package br.com.oopII.instrutoresVoluntarios;

public class Aprendiz extends Morador {
    String interesse;

    public Aprendiz(String nome, String endereco, String numeroTelefoneCelular, String interesse) {
        this.nome = nome;
        this.endereco = endereco;
        this.numeroTelefoneCelular = numeroTelefoneCelular;
        this.interesse = interesse;

    }

    public String getInteresse() {
        return interesse;
    }

    public void setInteresse(String interesse) {
        this.interesse = interesse;
    }
}
