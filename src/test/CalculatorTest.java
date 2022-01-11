package test;

import main.Calculator;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class CalculatorTest {

    @Test
    public void shouldReturnAccumulatorOfZeroWhenCreated() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(BigDecimal.ZERO, calculator.getAccumulator());
    }
}
