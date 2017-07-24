package calculator.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import io.calculator.Calculator;
import io.calculator.CalculatorApp;
import io.calculator.service.CalculatorService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CalculatorApp.class)
public class CalculatorTest {

	@Autowired
	private CalculatorService calculatorService;

	@Test
	public void contextLoads() {

	}

	@Test
	public void testAdd() {
		Calculator calc = new Calculator(100, 50);
		double result = calculatorService.add(calc);
		assertEquals(150, result, 0);
	}

	@Test
	public void testSubtract() {
		Calculator calc = new Calculator(100, 50);
		double result = calculatorService.subtract(calc);
		assertEquals(50, result, 0);
	}

	@Test
	public void testMultiply() {
		Calculator calc = new Calculator(100, 50);
		double result = calculatorService.multiply(calc);
		assertEquals(5000, result, 0);
	}

	@Test
	public void testDivide() {
		Calculator calc = new Calculator(100, 50);
		double result = calculatorService.divide(calc);
		assertEquals(2, result, 0);
	}

	@Test
	public void testDivisionByZero() throws Exception {
		Calculator calc = new Calculator(100, 0);
		double result = calculatorService.divide(calc);
		assertEquals(2, result, 0);
	}

}
