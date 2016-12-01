package org.learntocodeseoul.calculator;

/**
 * Created by hector on 12/1/16.
 */
public class CalculatorException extends RuntimeException {

    public static final String UNDEFINED = "Solar flare interrupted process";
    public static final String ZERO_DIV = "Can't divide by zero";
    public static final String MISMATCH_PARENS = "Parens must match";
    public static final String INVALID_INPUT = "Must be valid input (only numbers and mathematical operators";

    public CalculatorException() {
        this(CalculatorException.UNDEFINED);
    }

    public CalculatorException(String message) {
        super(message);
    }

}
