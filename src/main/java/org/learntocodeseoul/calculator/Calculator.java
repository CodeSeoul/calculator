package org.learntocodeseoul.calculator;

public class Calculator {

	public long compute(String operator, long first, long second) {
		if (operator == null) {
			throw new RuntimeException("Operator can't be null");
		}
		switch (operator) {
			case "plus":
				return plus(first, second);
			case "minus":
				return minus(first, second);
			case "times":
				return times(first, second);
			case "divide":
				return divide(first, second);
			default:
				throw new RuntimeException("Invalid Operator");
		}
	}

	public long plus(long first, long second) {
		return first + second;
	}

	public long minus(long first, long second) {
		return first - second;
	}

	public long times(long first, long second) {
		return first * second;
	}

	public long divide(long first, long second) {
		if (second == 0) {
			throw new CalculatorException(CalculatorException.ZERO_DIV);
		} else {
			return first / second;
		}

	}
}
