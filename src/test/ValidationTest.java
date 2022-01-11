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
}
