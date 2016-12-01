package org.learntocodeseoul.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by hector on 12/1/16.
 */
public class CalculatorExceptionTests {
    @Test
    public void testCalculatorException() throws Exception {
        Exception test = new CalculatorException(CalculatorException.INVALID_INPUT);
        assertEquals(CalculatorException.INVALID_INPUT, test.getMessage());

    }

    @Test
    public void testCalcaulatorExceptionNoparam() {
        Exception test = new CalculatorException();
        assertEquals(CalculatorException.UNDEFINED, test.getMessage());
    }
}
