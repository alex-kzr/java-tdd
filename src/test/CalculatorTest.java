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

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowAnExceptionWhenThreeDecimalPlaceValuePassed(){
        Calculator calculator = new Calculator();
        calculator.add("1.11","1.111");
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
        String result = calculator.subtractStrings("3.33","2.22");
        Assert.assertEquals("1.11", result);
    }

    @Test
    public void shouldReturnMinusOneWhenNegativeThreeSubtractNegativeTwoIsCalled(){
        Calculator calculator = new Calculator();
        String result = calculator.subtractStrings("-3.33","-2.22");
        Assert.assertEquals("-1.11", result);
    }
}
