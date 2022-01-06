package test;

import main.FizzBuzz;
import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void shouldReturnInstanceOfFizzBuzzClass(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertNotNull(fizzBuzz);
    }

    @Test
    public void shouldReturnFizzWhenIntDivisibleByThreeIsPassed(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.check(3);
        Assert.assertEquals("Fizz", result);
    }

    @Test
    public void shouldReturnFizzWhenIntDivisibleByThreeIsPassed_2(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.check(9);
        Assert.assertEquals("Fizz", result);
    }

    @Test
    public void shouldReturnValueWhenIsNotIntDivisibleByThreeIsPassed(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.check(2);
        Assert.assertEquals("2", result);
    }

    @Test
    public void shouldReturnBuzzWhenIsDiversibleByFiveIsPassed(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.check(5);
        Assert.assertEquals("Buzz", result);
    }
}
