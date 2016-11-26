package org.learntocodeseoul.calculator;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Created by hector on 11/26/16.
 */
public class CalculatorTest {
    private Calculator calc = new Calculator();
    private Random rand = new Random();

    @Test
    public void testPlus(){
        long rand1 = rand.nextLong();
        long rand2 = rand.nextLong();
        long expected = rand1 + rand2;
        assertEquals(rand1 + " plus " + rand2 + "must be " + expected, expected , calc.plus(rand1,rand2));
    }
    @Test
    public void testMinus(){
        long rand1 = rand.nextLong();
        long rand2 = rand.nextLong();
        long expected = rand1 - rand2;
        assertEquals(rand1 + " minus " + rand2 + "must be " + expected, expected , calc.minus(rand1,rand2));
    }
    @Test
    public void testDivide(){
        long rand1 = rand.nextLong();
        long rand2 = rand.nextLong();
        long expected = rand1 / rand2;
        assertEquals(rand1 + " divided by " + rand2 + "must be " + expected, expected , calc.divide(rand1,rand2));

    }
    @Test
    public void testMult(){
        long rand1 = rand.nextLong();
        long rand2 = rand.nextLong();
        long expected = rand1 * rand2;
        assertEquals(rand1 + " times " + rand2 + "must be " + expected, expected , calc.times(rand1,rand2));
    }
    @Test
    public void testCompute(){
        assertEquals(3, calc.compute("plus",  1, 2));
        assertEquals(2, calc.compute("minus", 4, 2));
        assertEquals(1, calc.compute("times", 1, 1));
        assertEquals(1, calc.compute("divide", 2, 2));


    }
    @Test(expected = RuntimeException.class)
    public void testComputeAbnormal(){
        calc.compute("PLUS", 1, 2);
        calc.compute(null, 1, 2);
    }

}
