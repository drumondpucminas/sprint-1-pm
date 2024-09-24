import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VooTest {

    private Companhia companhia;
    private Voo voo;

    @BeforeEach
    public void setUp() {
        companhia = new Companhia("Companhia Teste", 1);
        // Inicializando um Voo com dados de teste
        voo = new Voo(101, "10:00", "12:00", "2024-09-23", companhia);
    }

    @Test
    public void testGetCompanhiaByVoo() {
        assertEquals(companhia, voo.getCompanhiaByVoo(), "A companhia do voo deve ser a companhia testada.");
    }

    @Test
    public void testGetNumero() {
        assertEquals(101, voo.getNumero(), "O número do voo deve ser 101.");
    }

    @Test
    public void testSetNumero() {
        voo.setNumero(202);
        assertEquals(202, voo.getNumero(), "O número do voo deve ser atualizado para 202.");
    }

    @Test
    public void testConstructorWithCompanhia() {
        Voo novoVoo = new Voo(202, "15:00", "17:00", "2024-09-24", companhia);
        assertEquals(202, novoVoo.getNumero(), "O número do novo voo deve ser 202.");
        assertEquals("15:00", novoVoo.horarioPartida, "O horário de partida deve ser 15:00.");
        assertEquals("17:00", novoVoo.horarioChegada, "O horário de chegada deve ser 17:00.");
    }
}
