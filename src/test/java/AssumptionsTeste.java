import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIf;

public class AssumptionsTeste {


    @Test
    void validarAlgoSomenteNoUserPassarosuke(){
        String user = "Ching";

        Assumptions.assumeTrue("Ching".equals(user));
        System.out.println(System.getenv("USERNAME"));
        Assertions.assertEquals(10,5+5);
    }
}
