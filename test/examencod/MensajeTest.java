 
package examencod;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author acarreiragonzalez
 */
public class MensajeTest {

    public MensajeTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of obtenerMCD method, of class Calculo.
     */
    @Test
    public void testObtenerMCD() {
        System.out.println("obtenerMCD");
        int num1 = 0;
        int num2 = 0;
        String expResult = "ERROR exception";
        Calculo instance = new Calculo(); 
        instance.setNumero1(num1);
        instance.setNumero2(num2);
        instance.obtenerMCD(num1, num2);
        String result = instance.getMensajeResultado();
        assertEquals(expResult, result);
    }

}