import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import java.time.LocalDateTime;

public class ConsultarDadosPessoaTest {

    @BeforeAll
    static void configuraConexao(){
        BancoDeDados.iniciarConexao();

    }
    @BeforeEach
    void insereDadosParaTeste(){
        Pessoa pessoa = new Pessoa("Ching", LocalDateTime.of(2000,1,1,0,0,0));
        BancoDeDados.insereDados(pessoa);
    }

    @AfterEach
    void removeDadosDoTeste(){
        BancoDeDados.removeDados( new Pessoa("Ching",LocalDateTime.of(2000,1,1,0,0,0)));
    }

    @Test
    void validarDadosDeRetorno(){
        assertTrue(true);
    }

    @AfterAll
    static void finalizarConexao(){
        BancoDeDados.finalizarConexao();

    }

}
