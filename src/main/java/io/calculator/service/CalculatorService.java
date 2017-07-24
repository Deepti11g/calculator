package io.calculator.service;

import java.util.Scanner;

import org.springframework.stereotype.Service;

import io.calculator.Calculator;

@Service
public class CalculatorService {
	//Scanner scan=new Scanner(System.in);
	public double add(Calculator calc)
	{
		double num1=calc.getNum1();
		double num2=calc.getNum2();
		return (num1+num2);
	}
	public double subtract(Calculator calc)
	{
		double num1=calc.getNum1();
		double num2=calc.getNum2();
		return (num1-num2);
	}
	public double multiply(Calculator calc)
	{
		double num1=calc.getNum1();
		double num2=calc.getNum2();
		return (num1*num2);
	}
	public double divide(Calculator calc)
	{
		double num1=calc.getNum1();
		double num2=calc.getNum2();
		if(num2 == 0) {
            throw new IllegalArgumentException("num2 must not be zero");
        }
		return (num1/num2);
	}

}
