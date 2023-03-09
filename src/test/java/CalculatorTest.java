import org.example.Main;
import static org.junit.Assert.*;
import org.junit.*;

public class CalculatorTest {

    Main main=new Main();
    @Test
    public void test_sqrt(){
        assertEquals(3,main.sqrt(9),0);
        assertEquals(10,main.sqrt(100),0);
        assertEquals(5,main.sqrt(25),0);
        assertEquals(1,main.sqrt(1),0);
        assertNotEquals(23,main.sqrt(9),0);
        assertNotEquals(120,main.sqrt(100),0);
        assertNotEquals(52,main.sqrt(25),0);
        assertNotEquals(12,main.sqrt(1),0);
        }
    @Test
    public void test_factorial(){
        assertEquals(1,main.factorial(0),0);
        assertEquals(1,main.factorial(1),0);
        assertEquals(120,main.factorial(5),0);
        assertEquals(40320 ,main.factorial(8),0);
        assertNotEquals(0,main.factorial(0),0);
        assertNotEquals(2,main.factorial(1),0);
        assertNotEquals(52,main.factorial(5),0);
        assertNotEquals(12,main.factorial(8),0);
    }
}
