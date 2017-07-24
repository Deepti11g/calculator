package io.calculator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.calculator.Calculator;
import io.calculator.service.CalculatorService;

@RestController
public class CalculatorController {

	@Autowired
	public CalculatorService calculatorService;

	@RequestMapping("/hello")
	public String sayHello() {
		return "HELLO DEEPTI";
	}

	@RequestMapping(method=RequestMethod.POST, value="/add")
	public double add(@RequestBody Calculator calc) {
		return calculatorService.add(calc);
	}

	@RequestMapping(method=RequestMethod.POST, value="/subtract")
	public double subtract(@RequestBody Calculator calc) {
		return calculatorService.subtract(calc);
	}

	@RequestMapping(method=RequestMethod.POST, value="/multiply")
	public double multiply(@RequestBody Calculator calc) {
		return calculatorService.multiply(calc);
	}

	@RequestMapping(method=RequestMethod.POST, value="/divide")
	public double divide(@RequestBody Calculator calc) {
		return calculatorService.divide(calc);
	}

}
