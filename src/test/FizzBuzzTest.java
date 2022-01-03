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

}
