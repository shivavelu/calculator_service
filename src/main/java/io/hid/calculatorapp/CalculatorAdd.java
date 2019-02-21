package io.hid.calculatorapp;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorAdd {
	@RequestMapping("/Add/{a}/{b}")
	public int performAddition(@PathVariable int a, @PathVariable int b)
	{
			return a+b;
	}
	
	@RequestMapping("/Subtract/{a}/{b}")
	public int performSubtraction(@PathVariable int a, @PathVariable int b)
	{
		return a-b;
	}
	
	@RequestMapping("/Multiply/{a}/{b}")
	public int performMultiplication(@PathVariable int a, @PathVariable int b)
	{
		return a*b;
	}
	
	@RequestMapping("/Divide/{a}/{b}")
	public String performDivision(@PathVariable int a, @PathVariable int b)
	{
		int d=a/b;
		int r=a%b;
		return d+"."+r;
	}

}
