package test;

import main.Validation;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class ValidationTest {
    Validation validation;

    @Before
    public void setUp() {
        validation = new Validation();
    }

    @Test
    public void shouldReturnAnInstanceOfAValidation(){
        Assert.assertNotNull(validation);
    }

    @Test
    public void shouldReturnEmptyListWhenNoErrorsPassedIn() {
        List<String> errors = validation.validate("1.11", "2.22");
        Assert.assertTrue(errors.isEmpty());
    }

    @Test
    public void shouldReturnOneErrorInListWhenOneErrorDecimalPassedIn() {
        List<String> errors = validation.validate("1.111");
        Assert.assertEquals(1, errors.size());
        Assert.assertEquals("Too many decimal places for value 1.111", errors.get(0));
    }

    @Test
    public void shouldReturnTwoErrorsInListWhenTwoErrorDecimalsPassedIn() {
        List<String> errors = validation.validate("1.111", "2.222");
        Assert.assertEquals(2, errors.size());
        Assert.assertEquals("Too many decimal places for value 1.111", errors.get(0));
        Assert.assertEquals("Too many decimal places for value 2.222", errors.get(1));
    }
}
