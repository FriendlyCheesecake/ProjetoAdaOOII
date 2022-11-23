package br.com.oopII.instrutoresVoluntarios;

public class Main {
    public static void main(String[] args) {

        Instrutor instrutor1 = new Instrutor("Suzana Dias", "Bloco J, apartamento 103", "01021853486", "Jazz Piano");
        Instrutor instrutor2 = new Instrutor("Ana Magalhães", "Bloc I, apartamento 312", "999786227","Excel");
        Instrutor instrutor3 = new Instrutor("Carlos Alberto", "Bloc H, apartamento 113", "854699875", "Crochê");

        /*SelecaoInstrutor mostraLista = new SelecaoInstrutor();
        mostraLista.Anuncio();*/

        InstrutorRepository repository = new InstrutorRepository();
        repository.Anuncio();
        repository.adicionarInstrutor(instrutor1);
        repository.adicionarInstrutor(instrutor2);
        repository.adicionarInstrutor(instrutor3);
        repository.Escolha();

    }}