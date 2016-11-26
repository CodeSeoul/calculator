package org.learntocodeseoul.calculator;

public class Calculator {

	public long choice(String operator, long first, long second) {
		if (operator.equals("plus")){
			return plus(first, second);
		}
		return -1;
	}
	public long plus(long first, long second) {
		return first + second;
	}

	public long minus(long first, long second) { return first - second; }

	public long times(long first, long second) { return first * second; }

	public long divide(long first, long second) { return first/second; }

}
