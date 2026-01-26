package dam.optativa;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DiscountCalculatorTest {
    @Test
    void testStudentDiscount() {
        DiscountCalculator calc = new DiscountCalculator();
        double result = calc.calculate(100.0, true);
        assertEquals(80.0, result, 0.001);
    }


    @Test
    void testNonStudentDiscount() {
        DiscountCalculator calc = new DiscountCalculator();
        double result = calc.calculate(100.0, false);
        assertEquals(95.0, result, 0.001);
    }


    @Test
    void testZeroPrice() {
        DiscountCalculator calc = new DiscountCalculator();
        double result = calc.calculate(0.0, true);
        assertEquals(0.0, result, 0.001);
    }


    @Test
    void testNegativePrice() {
        DiscountCalculator calc = new DiscountCalculator();
        try {
            double result = calc.calculate(-3.0, false);
            fail("Se esperaba IllegalArgumentException");
        } catch (IllegalArgumentException e) {

        }
    }

}
