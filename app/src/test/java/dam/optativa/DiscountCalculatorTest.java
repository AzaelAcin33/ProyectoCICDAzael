package dam.optativa;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DiscountCalculatorTest {

    @Test
    public void testStudentDiscount() {
        DiscountCalculator calc = new DiscountCalculator();
        double result = calc.calculate(100.0, true);
        assertEquals(80.0, result, 0.001);
    }

    @Test
    public void testNonStudentDiscount() {
        DiscountCalculator calc = new DiscountCalculator();
        double result = calc.calculate(100.0, false);
        assertEquals(95.0, result, 0.001);
    }

    @Test
    public void testZeroPrice() {
        DiscountCalculator calc = new DiscountCalculator();
        double result = calc.calculate(0.0, true);
        assertEquals(0.0, result, 0.001);
    }

    @Test
    public void testNegativePrice() {
        DiscountCalculator calc = new DiscountCalculator();
        double result = calc.calculate(-3.0, false);
        assertEquals(0.0, result, 0.001);
    }
}
