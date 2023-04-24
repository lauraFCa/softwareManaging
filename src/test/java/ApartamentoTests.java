import br.cesjf.hotellucena.model.Apartamento;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApartamentoTests {

    @Test
    void shouldReturnCorrectStringWithApartmentId(){
        Apartamento apto = new Apartamento(23);
        assertEquals("br.cesjf.hotellucena.Apartamento[ idApartamento=23 ]", apto.toString());
        System.out.println("Test finish running");
    }
}
