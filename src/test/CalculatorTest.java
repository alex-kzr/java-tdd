package test;

import main.Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void createCalculator(){
        calculator = new Calculator();
    }

    @Test
    public void shouldReturnAccumulatorOfZeroWhenCreated() {
        Assert.assertEquals(BigDecimal.ZERO, calculator.getAccumulator());
    }

    @Test
    public void shouldReturnSetAccumulatorValue() {
        BigDecimal value = new BigDecimal(23);
        calculator.setAccumulator(value);
        Assert.assertEquals(value, calculator.getAccumulator());
    }
}
