import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class calculatorTest {

    private static final double DELTA = 1e-15;
    calculator calc = new calculator();

    @Test
    public void squareRootTruePositive(){
        assertEquals("Finding Square Root of integers",5,calc.squareRoot(25),DELTA);
        assertEquals("Finding Square Root of double",2.756809750418044,calc.squareRoot(7.6),DELTA);
    }
    @Test
    public void squareRootFalsePositive(){
        assertNotEquals("Finding Square Root of integers",4,calc.squareRoot(25),DELTA);
        assertNotEquals("Finding Square Root of double",4.012223,calc.squareRoot(7.6),DELTA);
    }
    @Test
    public void factorialTruePositive(){
        assertEquals("Finding factorial of integers",120,calc.factorial(5),DELTA);

    }
    @Test
    public void factorialFalsePositive(){
        assertNotEquals("Finding factorial of integers",20,calc.factorial(5),DELTA);

    }
    @Test
    public void naturalLogTruePositive(){
        assertEquals("Finding natural log of integers",2.302585092994046,calc.naturalLog(10),DELTA);

    }
    @Test
    public void naturalLogFalsePositive(){
        assertNotEquals("Finding natural log of integers",1,calc.naturalLog(4),DELTA);

    }

    @Test
    public void powerTruePositive(){
        assertEquals("Calculating power function",1024,calc.power(2,10),DELTA);

    }
    @Test
    public void powerFalsePositive(){
        assertNotEquals("Calculating power function",17,calc.power(4,2),DELTA);

    }
}