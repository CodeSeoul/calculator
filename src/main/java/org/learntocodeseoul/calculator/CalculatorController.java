package org.learntocodeseoul.calculator;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

	private Calculator calculator = new Calculator();

	@RequestMapping("/calculate/{operation}")
	public Response calculate(@PathVariable String operation, @RequestParam String first, @RequestParam String second) {
		long firstLong;
		long secondLong;
		try {
			// TODO change exception handling from default to custom for null values
			firstLong = Long.parseLong(first);
			secondLong = Long.parseLong(second);
		} catch (Exception e) {
			return new Response("FAILURE", -1, e.getMessage());
		}

		try {
			long answer = calculator.compute(operation, firstLong, secondLong);
			return new Response("SUCESS", answer);
		} catch(Exception e) {
			return new Response("FAILURE", -1, e.getMessage());
			// TODO change Response class to take a string for error messages
		}
	}

	@RequestMapping("/plus")
	public Response plus(@RequestParam String first, @RequestParam String second) {
		return calculate("plus", first, second);
	}

	@RequestMapping("/minus")
	public Response minus(@RequestParam String first, @RequestParam String second) {
		return calculate("minus", first, second);
	}

	@RequestMapping("/times")
	public Response times(@RequestParam String first, @RequestParam String second) {
		return calculate("times", first, second);
	}

	@RequestMapping("/divide")
	public Response divide(@RequestParam String first, @RequestParam String second) {
		return calculate("divide", first, second);
	}

}
