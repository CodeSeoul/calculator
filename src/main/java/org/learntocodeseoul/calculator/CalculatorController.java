package org.learntocodeseoul.calculator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

	private Calculator calculator = new Calculator();

	@RequestMapping("/plus")
	public Response plus(@RequestParam String first, @RequestParam String second) {
		try {
			long firstLong = Long.parseLong(first);
			long secondLong = Long.parseLong(second);
			long sum = calculator.plus(firstLong, secondLong);
			return new Response("SUCESS", sum);
		} catch(Exception e) {
			return new Response("FAILURE", -1);
		}
	}

	@RequestMapping("/minus")
	public Response minus(@RequestParam String first, @RequestParam String second) {
		try {
			long firstLong = Long.parseLong(first);
			long secondLong = Long.parseLong(second);
			long sum = calculator.minus(firstLong, secondLong);
			return new Response("SUCESS", sum);
		} catch(Exception e) {
			return new Response("FAILURE", -1);
		}
	}

	@RequestMapping("/times")
	public Response times(@RequestParam String first, @RequestParam String second) {
		try {
			long firstLong = Long.parseLong(first);
			long secondLong = Long.parseLong(second);
			long sum = calculator.times(firstLong, secondLong);
			return new Response("SUCESS", sum);
		} catch(Exception e) {
			return new Response("FAILURE", -1);
		}
	}

	@RequestMapping("/divide")
	public Response divide(@RequestParam String first, @RequestParam String second) {
		try {
			long firstLong = Long.parseLong(first);
			long secondLong = Long.parseLong(second);
			long sum = calculator.divide(firstLong, secondLong);
			return new Response("SUCESS", sum);
		} catch(Exception e) {
			return new Response("FAILURE", -1);
		}
	}

}
