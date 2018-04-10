import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private Calculator arithmetic;

    @Before
    public void before() {
        arithmetic = new Calculator(10, 2);
    }

    @Test
    public void doesItAdd(){
        assertEquals(12, arithmetic.add());
    }

    @Test
    public void doesItSubtract(){
        assertEquals(8, arithmetic.subtract());
    }

    @Test
    public void doesItMultiply(){
        assertEquals(20, arithmetic.multiply());
    }

    @Test
    public void doesItDivide(){
        assertEquals(5, arithmetic.divide());
    }

}
