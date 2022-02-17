import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Questao2Test
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
    void senhaTamTresLetras()
    {
        Questao2 q2 = new Questao2();

        q2.senhaTam("abc");

        assertEquals("3", output.toString().trim());
    }

    @Test
    void senhaTamCincoLetras()
    {
        Questao2 q2 = new Questao2();

        q2.senhaTam("abc12");

        assertEquals("1", output.toString().trim());
    }

    @Test
    void senhaTamZeroLetras()
    {
        Questao2 q2 = new Questao2();

        q2.senhaTam("");

        assertEquals("6", output.toString().trim());
    }

    @Test
    void senhaTamSeisLetras()
    {
        Questao2 q2 = new Questao2();

        q2.senhaTam("123456");

        assertEquals("Sua senha tem o tamanho necessário", output.toString().trim());
    }

    @Test
    void senhaTamNoveLetras()
    {
        Questao2 q2 = new Questao2();

        q2.senhaTam("123456789");

        assertEquals("Sua senha tem o tamanho necessário", output.toString().trim());
    }

}