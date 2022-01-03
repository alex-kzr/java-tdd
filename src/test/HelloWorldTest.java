package test;

import main.HelloWorld;
import org.junit.Assert;
import org.junit.Test;

public class HelloWorldTest {

    @Test
    public void shouldReturnInstanceOfAHelloWorld(){
        HelloWorld helloWorld = new HelloWorld();
        Assert.assertNotNull(helloWorld);
    }
}
