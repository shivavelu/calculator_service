package io.hid.calculatorstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "io.hid.calculatorapp")
public class CalculatorApiApp {

	public static void main(String[] args) {
		SpringApplication.run(CalculatorApiApp.class, args);


	}

}
