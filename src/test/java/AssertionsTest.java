import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTest {

    @Test
    void validarLancamentos(){
        int [] primeiroLancamento = {10,20,30,40,50};
        int [] segundoLancamento = {10,5,2,3,10};

        // Assertions.assertArrayEquals(primeiroLancamento,segundoLancamento);
        Assertions.assertNotEquals(primeiroLancamento,segundoLancamento);
    }

    @Test
    void validarSeObjetoEstaNulo(){
        Pessoa p = null;
        Assertions.assertNull(p);

        p = new Pessoa("Passarosuke", LocalDateTime.now());

        Assertions.assertNotNull(p);
    }

    @Test
    void validarNumerosDeTiposDiferentes(){
        double valor = 5.0;
        double outroValor = 5.0;

        assertEquals(valor,outroValor);
    }


}
