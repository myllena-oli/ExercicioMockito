package Exercicio;

import java.util.ArrayList;
import java.util.List;

public class BancoDePessoas {

    static List<Pessoas> nomes = new ArrayList<>();
    public void listaPessoas(){
        Pessoas pessoa1 = new Pessoas("Damon");
        Pessoas pessoa2 = new Pessoas("Stefan");
        Pessoas pessoa3 = new Pessoas("Elena");
        Pessoas pessoa4 = new Pessoas("Klaus");
        Pessoas pessoa5 = new Pessoas("Elijah");
        nomes.add(pessoa1);
        nomes.add(pessoa2);
        nomes.add(pessoa3);
        nomes.add(pessoa4);
        nomes.add(pessoa5);
    }

    public Pessoas encontrarPorId(int id){
        for(Pessoas pessoa:nomes){
            if(pessoa.getId()==id){
                return pessoa;
            }
        }
        return null;
    }

}
