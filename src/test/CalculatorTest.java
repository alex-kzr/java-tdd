package test;

import main.Calculator;
import main.Validation;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    private Calculator calculator;
    private Validation validation;

    @Before
    public void setUp() {
        validation = new Validation();
        calculator = new Calculator(validation);
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

    @Test
    public void shouldReturn4When2Times2IsCalled(){
        String result = calculator.multiply("2", "2");
        Assert.assertEquals("4", result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowAnExceptionWhenThreeDecimalPlaceValuePassedToMultiplyMethod(){
        calculator.multiply("1.11","1.111");
    }

    @Test
    public void shouldReturn2When4DividedBy2IsCalled(){
        String result = calculator.divide("4", "2");
        Assert.assertEquals("2", result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowAnExceptionWhenThreeDecimalPlaceValuePassedToDivideMethod(){
        calculator.divide("1.11","1.111");
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowAnExceptionWhenSecondValueIsZeroToDivideMethodIsPassed(){
        calculator.divide("1.11","0");
    }
}
