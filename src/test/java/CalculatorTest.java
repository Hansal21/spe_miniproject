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
}
