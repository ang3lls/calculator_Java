package com.angelina.calculadora.services;

public class Operacao {
	
	public static Double somar(Double num1, Double num2){
		return num1 + num2;
	}

	public static Double subtrair(Double num1, Double num2) {
		return num1 - num2;
	}

	public static Double multiplicar(Double num1, Double num2) {
		return num1 * num2;
	}

	public static Double dividir(Double num1, Double num2) {
		return num1 / num2;
	}

	
	private Operacao() {}

}
