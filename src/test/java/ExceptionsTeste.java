import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTeste {
    @Test
    void validarCenarioDeExcecaoNaTransefrencia(){
        Conta contaOrigem = new Conta(123123,0);
        Conta contaDestino = new Conta(234234,5000);
        TransferenciaEntreContas tranferencia = new TransferenciaEntreContas();

        Assertions.assertThrows(IllegalArgumentException.class, ()->tranferencia.transfere(contaOrigem,contaDestino,-1));
        Assertions.assertDoesNotThrow( ()->tranferencia.transfere(contaOrigem,contaDestino,500));
    }
}
