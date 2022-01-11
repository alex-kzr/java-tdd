package test;

import main.Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void shouldReturnAnInstanceOfACalculator(){
        Assert.assertNotNull(calculator);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowAnExceptionWhenThreeDecimalPlaceValuePassedToAddMethod(){
        calculator.add("1.11","1.111");
    }

    @Test
    public void shouldReturnTwoWhenOnePlusOneIsCalled(){
        String result = calculator.add("1.11", "1.11");
        Assert.assertEquals("2.22", result);
    }

    @Test
    public void shouldReturnNegativeTwoWhenNegativeOnePlusNegativeOneIsCalled(){
        String result = calculator.add("-1.11", "-1.11");
        Assert.assertEquals("-2.22", result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowAnExceptionWhenThreeDecimalPlaceValuePassedToSubtractMethod(){
        calculator.subtract("1.11","1.111");
    }

    @Test
    public void shouldReturnOneWhenThreeSubtractTwoIsCalled(){
        String result = calculator.subtract("3.33","2.22");
        Assert.assertEquals("1.11", result);
    }

    @Test
    public void shouldReturnMinusOneWhenNegativeThreeSubtractNegativeTwoIsCalled(){
        String result = calculator.subtract("-3.33","-2.22");
        Assert.assertEquals("-1.11", result);
    }
}
