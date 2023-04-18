import br.cesjf.hotellucena.model.Apartamento;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApartamentoTests {

    @Test
    public void shouldReturnCorrectStringValue(){
        Apartamento apartamento = new Apartamento(10, 589);
        assertEquals("br.cesjf.hotellucena.Apartamento[ idApartamento=10 ]", apartamento.toString());
    }
}
