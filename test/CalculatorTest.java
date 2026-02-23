import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    /* -------------------- Square Root Tests -------------------- */

    @Test
    public void testSquareRootPerfectSquare() {
        assertEquals(4.0, Calculator.squareRoot(16));
    }

    @Test
    public void testSquareRootDecimal() {
        assertEquals(3.0, Calculator.squareRoot(9.0));
    }

    @Test
    public void testSquareRootZero() {
        assertEquals(0.0, Calculator.squareRoot(0));
    }

    @Test
    public void testSquareRootNegative() {
        assertTrue(Double.isNaN(Calculator.squareRoot(-4)));
    }


    /* -------------------- Factorial Tests -------------------- */

    @Test
    public void testFactorialPositive() {
        assertEquals(120, Calculator.factorial(5));
    }

    @Test
    public void testFactorialOne() {
        assertEquals(1, Calculator.factorial(1));
    }

    @Test
    public void testFactorialZero() {
        assertEquals(1, Calculator.factorial(0));
    }

    @Test
    public void testFactorialLargeNumber() {
        assertEquals(3628800, Calculator.factorial(10));
    }


    /* -------------------- Natural Log Tests -------------------- */

    @Test
    public void testNaturalLogValid() {
        assertEquals(1.0, Calculator.naturalLog(Math.E), 0.0001);
    }

    @Test
    public void testNaturalLogOne() {
        assertEquals(0.0, Calculator.naturalLog(1), 0.0001);
    }

    @Test
    public void testNaturalLogZero() {
        assertTrue(Double.isInfinite(Calculator.naturalLog(0)));
    }

    @Test
    public void testNaturalLogNegative() {
        assertTrue(Double.isNaN(Calculator.naturalLog(-5)));
    }


    /* -------------------- Power Function Tests -------------------- */

    @Test
    public void testPowerPositive() {
        assertEquals(8.0, Calculator.power(2, 3));
    }

    @Test
    public void testPowerZeroExponent() {
        assertEquals(1.0, Calculator.power(5, 0));
    }

    @Test
    public void testPowerZeroBase() {
        assertEquals(0.0, Calculator.power(0, 5));
    }

    @Test
    public void testPowerNegativeExponent() {
        assertEquals(0.25, Calculator.power(2, -2));
    }

    @Test
    public void testPowerDecimal() {
        assertEquals(9.0, Calculator.power(3, 2), 0.0001);
    }
}
