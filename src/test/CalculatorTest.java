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
        String result = calculator.add("1.11", "1.11");
        Assert.assertEquals("2.22", result);
    }

    @Test
    public void shouldReturnNegativeTwoWhenNegativeOnePlusNegativeOneIsCalled(){
        Calculator calculator = new Calculator();
        String result = calculator.add("-1.11", "-1.11");
        Assert.assertEquals("-2.22", result);
    }

    @Test
    public void shouldReturnOneWhenThreeSubtractTwoIsCalled(){
        Calculator calculator = new Calculator();
        int result = calculator.subtract(3,2);
        Assert.assertEquals(1, result);
    }

    @Test
    public void shouldReturnMinusOneWhenNegativeThreeSubtractNegativeTwoIsCalled(){
        Calculator calculator = new Calculator();
        int result = calculator.subtract(-3,-2);
        Assert.assertEquals(-1, result);
    }
}
