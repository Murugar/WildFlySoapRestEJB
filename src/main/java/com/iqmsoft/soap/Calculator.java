package com.iqmsoft.soap;

import javax.ejb.Stateless;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
@Stateless
public class Calculator {
	public double calcular(@WebParam(name = "num1") double x, 
			@WebParam(name = "operator") String op,
			@WebParam(name = "num2") double y) {
		switch (op) {
		case "+":
			return x + y;
		case "-":
			return x - y;
		case "*":
			return x * y;
		case "/":
			return x / y;
		default:
			throw new IllegalArgumentException("Operador Invalid!");
		}

	}
}
