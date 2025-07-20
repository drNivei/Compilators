import HomeWork1.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void addCalcTest(){
        assertEquals(4.4,calculator.addCalc(2.35, 2.05));
    }

    @Test
    public void divideCalcTest(){
        assertEquals(3.1463414634146347,calculator.divideCalc(6.45, 2.05));
    }

    @Test
    public void divideCalcTestZero(){
        try {
            // Code that is expected to throw an exception
            calculator.divideCalc(1,0);
            Assertions.fail("Expected UnsupportedOperationException was not thrown."); // If execution reaches here, test fails
        } catch (RuntimeException e) {
            // Exception caught, test passes
            assertEquals("На ноль делить нельзя!", e.getMessage());
        }

    }

    @Test
    public void subtractTest(){
        assertEquals(1.4,calculator.subtractCalc(2.8, 1.4));
    }

    @Test
    public void multiplyCalcTest(){
        assertEquals(4.2025,calculator.multiplyCalc(2.05, 2.05));
    }
}
