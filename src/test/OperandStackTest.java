package test;

import static org.junit.Assert.*;

import main.OperandStack;
import org.junit.Test;

import java.math.BigDecimal;

public class OperandStackTest {

    @Test
    public void shouldReturnZeroWhenNewOperandStackIsCreated(){
        OperandStack stack = new OperandStack();
        assertEquals(BigDecimal.ZERO, stack.peek());
    }
}
