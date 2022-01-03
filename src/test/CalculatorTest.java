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

    @Test
    public void shouldReturnTwoWhenOnePlusOneIsCalled(){
        Calculator calculator = new Calculator();
        int result = calculator.add(1, 1);
        Assert.assertEquals(2, result);
    }
}
