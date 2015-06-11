package examencod;

import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author administrador
 */
@RunWith(Parameterized.class)
public class BateriaTest {

    private int no1, no2, expResult;
    Calculo calc;

    public BateriaTest(int num1, int num2, int result) {
        this.no1 = num1;
        this.no2 = num2;
        this.expResult = result;
    }

    @Before
    public void initialize() {
        calc = new Calculo();
    }

    /**
     * Test of main method, of class Controlador.
     */
    @Parameterized.Parameters
    public static Collection primeNumbers() {
        return Arrays.asList(new Object[][]{
            {5, 5, 10},
            {6, 8, 2},
            {49, 7, 42},
            {3, 9, 3}
        });
    }

    @Test
    public void testMain() {
        System.out.println("Parameterized Number is : " + no1 + ", " + no2 + " ---> " + expResult);
        assertEquals(expResult,
                calc.obtenerMCD(no1, no2), 0.0);
    }
}