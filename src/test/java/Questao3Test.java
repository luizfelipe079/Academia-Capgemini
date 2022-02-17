import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Questao3Test
{

    private final PrintStream standartOut = System.out;
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();

    @BeforeEach
    public void init()
    {
        System.setOut(new PrintStream(output));
    }

    @AfterEach
    public void tearDown()
    {
        System.setOut(standartOut);
    }

    @Test
    void anagramasParesOvo()
    {
        Questao3 q3 = new Questao3();

        q3.anagramasPares("ovo");

        assertEquals("2", output.toString().trim());
    }

    @Test
    void anagramasParesPara()
    {
        Questao3 q3 = new Questao3();

        q3.anagramasPares("para");

        assertEquals("2", output.toString().trim());
    }

    @Test
    void anagramasPares()
    {
        Questao3 q3 = new Questao3();

        q3.anagramasPares("ifailuhkqq");

        assertEquals("3", output.toString().trim());
    }
}