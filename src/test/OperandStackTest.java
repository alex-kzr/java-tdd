package test;

import static org.junit.Assert.*;

import main.OperandStack;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

public class OperandStackTest {

    private OperandStack stack;

    @Before
    public void createStack() {
        stack = new OperandStack();
    }

    @Test
    public void shouldReturnZeroWhenNewOperandStackIsCreated(){
        assertEquals(BigDecimal.ZERO, stack.peek());
    }

    @Test
    public void shouldReturnValueAfterPushingItIntoStack() {
        BigDecimal value = new BigDecimal(12);
        stack.push(value);
        assertEquals(value, stack.peek());
    }
}
