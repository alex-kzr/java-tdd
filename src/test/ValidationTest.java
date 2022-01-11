package test;

import main.Validation;
import org.junit.Assert;
import org.junit.Test;

public class ValidationTest {

    @Test
    public void shouldReturnAnInstanceOfAValidation(){
        Validation validation = new Validation();
        Assert.assertNotNull(validation);
    }
}
