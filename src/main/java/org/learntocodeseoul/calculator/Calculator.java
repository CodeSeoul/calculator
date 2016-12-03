package org.learntocodeseoul.calculator;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;

public class Calculator {
	private LinkedList<Character> validCharacters = new LinkedList<>();
	public Calculator(){
		char[] operators = {'+', '-', '/', '*'};
		char[] numbers = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
		char[] paren = {'(', ')'};
		for (int i = 0; i < operators.length; i++) {
			validCharacters.add(operators[i]);
		}
		for (int i = 0; i < numbers.length; i++) {
			validCharacters.add(numbers[i]);
		}
		for (int i = 0; i < paren.length ; i++) {
			validCharacters.add(paren[i]);
		}

	}
	public long calculate(String expression) {
		char[] chars = expression.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if (!validCharacters.contains(chars[i])) {
				throw new CalculatorException(CalculatorException.INVALID_INPUT);
			}
		}
		String[] values = expression.split("\\+");

		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}
		long first = Long.parseLong(values[0]);
		long second = Long.parseLong(values[1]);
		System.out.println(first + " + " + second);
		String op = "+";
		switch(op){
			case "+":
				return first + second;
			case "/":
				return first / second;
			case "-":
				return first - second;
			case "*":
				return first * second;
		}




		return -1;
	}

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
