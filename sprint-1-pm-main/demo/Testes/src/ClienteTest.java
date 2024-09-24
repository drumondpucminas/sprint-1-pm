import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class ClienteTest {

    private Cliente cliente;
    private ArrayList<Voo> bilhetesTeste;

    @Before
    public void setUp() {
        cliente = new Cliente("usuarioTeste", "senhaTeste");
        bilhetesTeste = new ArrayList<>();
    }

    @Test
    public void testGetUsername() {
        assertEquals("usuarioTeste", cliente.getUsername());
    }

    @Test
    public void testSetUsername() {
        cliente.setUsername("novoUsuario");
        assertEquals("novoUsuario", cliente.getUsername());
    }

    @Test
    public void testGetSenha() {
        assertEquals("senhaTeste", cliente.getSenha());
    }

    @Test
    public void testSetSenha() {
        cliente.setSenha("novaSenha");
        assertEquals("novaSenha", cliente.getSenha());
    }

    @Test
    public void testGetBilhetes() {
        assertNull(cliente.getBilhetes());

        // Definir os bilhetes e testar se o valor foi atualizado corretamente
        cliente.setBilhetes(bilhetesTeste);
        assertEquals(bilhetesTeste, cliente.getBilhetes());
    }

    @Test
    public void testSetBilhetes() {
        // Verifica se o método setBilhetes altera corretamente a lista de bilhetes
        bilhetesTeste.add(new Voo());
        cliente.setBilhetes(bilhetesTeste);
        assertNotNull(cliente.getBilhetes());
        assertEquals(1, cliente.getBilhetes().size());
    }
}
