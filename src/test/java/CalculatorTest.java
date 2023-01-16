import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Test
    public void canAdd() {
        assertEquals(6, calculator.add(3, 3));
    }

    @Test
    public void canSubtract() {
        assertEquals(0, calculator.subtract(3, 3));
    }

    @Test
    public void canMultiply() {
        assertEquals(9, calculator.multiply(3, 3));
    }

    @Test
    public void canDivide() {
        assertEquals(1, calculator.divide(3, 3), 0);
    }
}
