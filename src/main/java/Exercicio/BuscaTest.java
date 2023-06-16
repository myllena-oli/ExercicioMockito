package Exercicio;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class BuscaTest {

    @Mock
    private BancoDePessoas bancoDePessoas;

    private Busca busca;

    @BeforeEach
    public void configuracao() {
        MockitoAnnotations.initMocks(this);
        busca = new Busca(bancoDePessoas);
    }


    @Test
    public void deveraFornecerONomeDaPessoaDoId(){
        when(bancoDePessoas.encontrarPorId(1)).thenReturn(new Pessoas("Damon"));

        String nome = busca.procurarPessoas(1);
        assertEquals("Damon", nome);
    }
    @Test
    public void deverainformarQueOCadastroNaoExiste(){
        when(bancoDePessoas.encontrarPorId(9)).thenReturn(new Pessoas(null));

        String nome = busca.procurarPessoas(9);
        assertEquals("Nome indisponível.", nome);
    }

}
