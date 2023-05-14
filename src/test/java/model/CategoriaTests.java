package model;

import br.cesjf.hotellucena.model.Categoria;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CategoriaTests {

    private Categoria categoria;

    @BeforeEach
    public void setUp() {
        categoria = new Categoria(1, "TipoCategoria", 100.0f, 2);
    }

    @Test
    public void testGetCodigoCategoria() {
        assertEquals(1, categoria.getCodigoCategoria());
    }

    @Test
    public void testSetCodigoCategoria() {
        categoria.setCodigoCategoria(2);
        assertEquals(2, categoria.getCodigoCategoria());
    }

    @Test
    public void testGetTipoCategoria() {
        assertEquals("TipoCategoria", categoria.getTipoCategoria());
    }

    @Test
    public void testSetTipoCategoria() {
        categoria.setTipoCategoria("NovoTipoCategoria");
        assertEquals("NovoTipoCategoria", categoria.getTipoCategoria());
    }

    @Test
    public void testGetValorDiaria() {
        assertEquals(100.0f, categoria.getValorDiaria(), 0.01);
    }

    @Test
    public void testSetValorDiaria() {
        categoria.setValorDiaria(150.0f);
        assertEquals(150.0f, categoria.getValorDiaria(), 0.01);
    }

    @Test
    public void testGetCapacidade() {
        assertEquals(2, categoria.getCapacidade());
    }

    @Test
    public void testSetCapacidade() {
        categoria.setCapacidade(4);
        assertEquals(4, categoria.getCapacidade());
    }

    @Test
    public void testEqualsSameObject() {
        assertTrue(categoria.equals(categoria));
    }

    @Test
    public void testEqualsEqualObjects() {
        Categoria categoria2 = new Categoria(1, "TipoCategoria", 100.0f, 2);
        assertTrue(categoria.equals(categoria2));
    }

    @Test
    public void testEqualsDifferentObjects() {
        Categoria categoria2 = new Categoria(2, "OutraCategoria", 200.0f, 4);
        assertFalse(categoria.equals(categoria2));
    }

    @Test
    public void testEqualsDifferentClass() {
        String notCategoria = "notCategoria";
        assertFalse(categoria.equals(notCategoria));
    }

    @Test
    public void testToString() {
        String expected = "br.cesjf.hotellucena.model.Categoria[ codigoCategoria=1 ]";
        assertEquals(expected, categoria.toString());
    }
}
