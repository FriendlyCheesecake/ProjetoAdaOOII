package br.com.oopII.instrutoresVoluntarios;

abstract class Morador {
    String nome;
    String endereco;
    String numeroTelefoneCelular;

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getNumeroTelefoneCelular() {
        return numeroTelefoneCelular;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setNumeroTelefoneCelular(String numeroTelefoneCelular) {
        this.numeroTelefoneCelular = numeroTelefoneCelular;
    }
}
