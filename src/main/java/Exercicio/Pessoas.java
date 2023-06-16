package Exercicio;

public class Pessoas {
    static int idUnica = 0;
    private int id;
    private String nome;

    public Pessoas(String nome) {
        idUnica++;
        this.id = idUnica;
        this.nome = nome;
    }


    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

}
