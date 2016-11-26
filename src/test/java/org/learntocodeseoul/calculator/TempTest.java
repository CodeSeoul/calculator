package org.learntocodeseoul.calculator;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by hector on 11/26/16.
 */
public class TempTest {

    @Test
    public void test() {
        String operator = "plus";
        String operator2 = "plus";
        assertTrue(operator == operator2);
        assertTrue(operator.equals(operator2));
    }

}
