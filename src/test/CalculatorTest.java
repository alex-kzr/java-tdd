package test;

import main.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void shouldReturnAnInstanceOfACalculator(){
        Calculator calculator = new Calculator();
        Assert.assertNotNull(calculator);
    }
}
