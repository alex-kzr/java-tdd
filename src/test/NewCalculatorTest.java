package test;

import main.Calculator;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;



public class NewCalculatorTest {

    private Calculator calculator;

    @Before
    public void createCalculator(){
        calculator = new Calculator();
    }

    @Test
    public void shouldReturnAccumulatorOfZeroWhenCreated() {
        assertEquals(BigDecimal.ZERO, calculator.getAccumulator());
    }

    @Test
    public void shouldReturnSetAccumulatorValue() {
        BigDecimal value = new BigDecimal(23);
        calculator.setAccumulator(value);
        assertEquals(value, calculator.getAccumulator());
    }
}
