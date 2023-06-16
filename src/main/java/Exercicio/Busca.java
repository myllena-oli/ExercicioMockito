package Exercicio;

public class Busca {
    private BancoDePessoas bancoDePessoas;

    public Busca(BancoDePessoas bancoDePessoas) {
        this.bancoDePessoas = bancoDePessoas;
    }



    public String procurarPessoas(int id){
        Pessoas pessoa = bancoDePessoas.encontrarPorId(id);

        String nome = pessoa.getNome();
        if (nome == null) {
            return "Nome indisponível.";
        } else {
            return nome;
        }
    }
}
