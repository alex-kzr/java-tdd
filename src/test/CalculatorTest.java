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

    @Test
    public void shouldReturnNegativeTwoWhenNegativeOnePlusNegativeOneIsCalled(){
        Calculator calculator = new Calculator();
        int result = calculator.add(-1, -1);
        Assert.assertEquals(-2, result);
    }

    @Test
    public void shouldReturnOneWhenThreeSubtractTwoIsCalled(){
        Calculator calculator = new Calculator();
        int result = calculator.subtract(3,2);
        Assert.assertEquals(1, result);
    }
}
