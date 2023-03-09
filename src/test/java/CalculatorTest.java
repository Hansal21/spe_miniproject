import org.example.Main;
import static org.junit.Assert.*;
import org.junit.*;

public class CalculatorTest {

    Main main=new Main();
    public static final Double DELTA=0.0000000001;
    @Test
    public void test_sqrt(){
        assertEquals(3,main.sqrt(9),DELTA);
        assertEquals(10,main.sqrt(100),DELTA);
        assertEquals(5,main.sqrt(25),DELTA);
        assertEquals(1,main.sqrt(1),DELTA);
        assertNotEquals(23,main.sqrt(9),DELTA);
        assertNotEquals(120,main.sqrt(100),DELTA);
        assertNotEquals(52,main.sqrt(25),DELTA);
        assertNotEquals(12,main.sqrt(1),DELTA);
        }
    @Test
    public void test_factorial(){
        assertEquals(1,main.factorial(0),DELTA);
        assertEquals(1,main.factorial(1),DELTA);
        assertEquals(120,main.factorial(5),DELTA);
        assertEquals(40320 ,main.factorial(8),DELTA);
        assertNotEquals(0,main.factorial(0),DELTA);
        assertNotEquals(2,main.factorial(1),DELTA);
        assertNotEquals(52,main.factorial(5),DELTA);
        assertNotEquals(12,main.factorial(8),DELTA);
    }
    @Test
    public void test_log(){
        assertEquals(2.30258509299,main.log(10),DELTA);
        assertEquals(3.91202300543,main.log(50),DELTA);
        assertEquals(2.56494935746,main.log(13),DELTA);
        assertEquals(0 ,main.log(1),DELTA);
        assertNotEquals(0,main.log(10),DELTA);
        assertNotEquals(2,main.log(50),DELTA);
        assertNotEquals(52,main.log(13),DELTA);
        assertNotEquals(12,main.log(1),DELTA);
    }@Test
    public void test_power(){
        assertEquals(1,main.power(1.0,0.0),DELTA);
        assertEquals(0,main.power(0.0,2.0),DELTA);
        assertEquals(27,main.power(3.0,3.0),DELTA);
        assertEquals(25 ,main.power(5.0,2.0),DELTA);
        assertNotEquals(0,main.power(10.0,3.0),DELTA);
        assertNotEquals(2,main.power(1.0,2.0),DELTA);
        assertNotEquals(52,main.power(3.0,2.0),DELTA);
        assertNotEquals(12,main.power(12.0,2.0),DELTA);
    }
}
