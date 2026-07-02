import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp(){
        calculator=new Calculator();
        System.out.println("Setup Executed");
    }

    @After
    public void tearDown(){
        System.out.println("Teardown Executed");
    }

    @Test
    public void testAddition(){

        int result=calculator.add(10,20);

        assertEquals(30,result);
    }

    @Test
    public void testSubtraction(){

        int result=calculator.subtract(20,5);

        assertEquals(15,result);
    }

    @Test
    public void testMultiplication(){

        int result=calculator.multiply(4,5);

        assertEquals(20,result);
    }

    @Test
    public void testDivision(){

        int result=calculator.divide(20,4);

        assertEquals(5,result);
    }
}