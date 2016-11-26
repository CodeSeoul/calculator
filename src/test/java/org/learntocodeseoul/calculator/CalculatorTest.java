package org.learntocodeseoul.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Created by hector on 11/26/16.
 */
public class CalculatorTest {
    private Calculator calc = new Calculator();

    @Test
    public void testPlus(){
        assertEquals(2, calc.plus(1,1));
        assertEquals("1 plus 1 must be 2", 3, calc.plus(1,2));
    }
    @Test
    public void testMinus(){

    }
    @Test
    public void testDivide(){

    }
    @Test
    public void testMult(){

    }

}
