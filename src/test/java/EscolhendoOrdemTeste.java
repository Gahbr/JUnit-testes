import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
// @TestMethodOrder(MethodOrderer.Random.class)
public class EscolhendoOrdemTeste {

    @Order(2)
    @Test
    void validaFluxoA(){
        Assertions.assertTrue(true);
    }

    @Order(3)
    @Test
    void validaFluxoB(){
        Assertions.assertTrue(true);
    }

    @Order(1)
    @Test
    void validaFluxoC(){
        Assertions.assertTrue(true);
    }

}
