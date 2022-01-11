package test;

import main.Validation;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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
}
