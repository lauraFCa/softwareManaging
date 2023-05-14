package model;

import br.cesjf.hotellucena.model.Apartamento;
import br.cesjf.hotellucena.model.Categoria;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ApartamentoTests {

    private Apartamento apartamento;
    private Categoria categoria;

    @BeforeEach
    public void setUp() {
        categoria = new Categoria(1, "TipoCategoria", 100.0f, 2);
        apartamento = new Apartamento(1, 1001);
        apartamento.setCategoriacodigoCategoria(categoria);
    }

    @Test
    public void testGetIdApartamento() {
        assertEquals(1, apartamento.getIdApartamento());
    }

    @Test
    public void testSetIdApartamento() {
        apartamento.setIdApartamento(2);
        assertEquals(2, apartamento.getIdApartamento());
    }

    @Test
    public void testGetCodigoApartamento() {
        assertEquals(1001, apartamento.getCodigoApartamento());
    }

    @Test
    public void testSetCodigoApartamento() {
        apartamento.setCodigoApartamento(1002);
        assertEquals(1002, apartamento.getCodigoApartamento());
    }

    @Test
    public void testGetCategoriacodigoCategoria() {
        assertEquals(categoria, apartamento.getCategoriacodigoCategoria());
    }

    @Test
    public void testSetCategoriacodigoCategoria() {
        Categoria novaCategoria = new Categoria(2, "NovaCategoria", 200.0f, 4);
        apartamento.setCategoriacodigoCategoria(novaCategoria);
        assertEquals(novaCategoria, apartamento.getCategoriacodigoCategoria());
    }

    @Test
    public void testEqualsSameObject() {
        assertTrue(apartamento.equals(apartamento));
    }

    @Test
    public void testEqualsEqualObjects() {
        Apartamento outroApartamento = new Apartamento(1, 1001);
        outroApartamento.setCategoriacodigoCategoria(categoria);
        assertTrue(apartamento.equals(outroApartamento));
    }

    @Test
    public void testEqualsDifferentObjects() {
        Apartamento outroApartamento = new Apartamento(2, 1002);
        outroApartamento.setCategoriacodigoCategoria(categoria);
        assertFalse(apartamento.equals(outroApartamento));
    }

    @Test
    public void testEqualsDifferentClass() {
        String notApartamento = "notApartamento";
        assertFalse(apartamento.equals(notApartamento));
    }

    @Test
    public void testToString() {
        String expected = "br.cesjf.hotellucena.Apartamento[ idApartamento=1 ]";
        assertEquals(expected, apartamento.toString());
    }
}
