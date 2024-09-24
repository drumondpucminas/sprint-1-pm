import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class CompanhiaTest {

    private Companhia companhia;
    private ArrayList<Companhia> companhias;

    @Before
    public void setUp() {
        companhia = new Companhia("Companhia A", "123456789", "Razao Social A", 50, 100, 200);

        companhias = new ArrayList<>();
        companhias.add(companhia);
        companhias.add(new Companhia("Companhia B", "987654321", "Razao Social B", 60, 120, 250));
    }

    @Test
    public void testGetNome() {
        assertEquals("Companhia A", companhia.getNome());
    }

    @Test
    public void testGetRazaoSocial() {
        assertEquals("Razao Social A", companhia.getRazaoSocial());
    }

    @Test
    public void testGetValorBagagemInicial() {
        assertEquals(50, companhia.getValorBagagemInicial());
    }

    @Test
    public void testSetValorBagagemInicial() {
        companhia.setValorBagagemInicial(60);
        assertEquals(60, companhia.getValorBagagemInicial());
    }

    @Test
    public void testGetValorBagagemAdicional() {
        assertEquals(100, companhia.getValorBagagemAdicional());
    }

    @Test
    public void testSetValorBagagemAdicional() {
        companhia.setValorBagagemAdicional(150);
        assertEquals(150, companhia.getValorBagagemAdicional());
    }

    @Test
    public void testGetTarifa() {
        assertEquals(200, companhia.getTarifa());
    }

    @Test
    public void testSetTarifa() {
        companhia.setTarifa(300);
        assertEquals(300, companhia.getTarifa());
    }

    @Test
    public void testToString() {
        String expected = "Companhia: Companhia A CNPJ: 123456789";
        assertEquals(expected, companhia.toString());
    }

    @Test
    public void testEncontrarCompanhiaPorNome_CompanhiaExistente() {
        Companhia encontrada = Companhia.encontrarCompanhiaPorNome("Companhia A", companhias);
        assertNotNull(encontrada);
        assertEquals("Companhia A", encontrada.getNome());
    }

    @Test
    public void testEncontrarCompanhiaPorNome_CompanhiaNaoExistente() {
        Companhia encontrada = Companhia.encontrarCompanhiaPorNome("Companhia C", companhias);
        assertNull(encontrada);
    }
}

