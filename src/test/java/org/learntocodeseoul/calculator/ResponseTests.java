package org.learntocodeseoul.calculator;

import org.junit.Test;

/**
 * Created by hector on 12/1/16.
 */
public class ResponseTests {
    @Test
    public void TestResponse(){
        Response testResponse = new Response("Failure", -1, CalculatorException.MISMATCH_PARENS);
    }
}
