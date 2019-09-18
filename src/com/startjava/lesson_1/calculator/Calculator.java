package com.startjava.lesson_1.calculator;

class Calculator {	
	public static void main(String args[]){
		int num1 = 5;
		int num2 = 8;
		char symbol = '^';
		System.out.print("\n");
		if(symbol == '+') {
			System.out.println("Результат сложения: " + num1 + " + " + num2 + " = " + (num1 + num2));
		} else if(symbol == '-') {
			System.out.println("Результат вычитания: " + num1 + " - " + num2 + " = " + (num1 - num2));
		} else if(symbol == '*') {
			System.out.println("Результат умножения: " + num1 + " * " + num2 + " = " + (num1 * num2));
		} else if(symbol == '/') {
			System.out.println("Результат деления: " + num1 + " / " + num2 + " = " + (num1 / num2));
		} else if(symbol == '^') {
			int pow = 1;
			for (int i = num2; i > 0; i--) {
				pow *= num1;
			}
			System.out.println("Результат возведения в степень: " + num1 + " ^ " + num2 + " = " + (pow));
		} else if(symbol == '%') {
			System.out.println("Результат остатка от деления: " + num1 + " % " + num2 + " = " + (num1 % num2));
		}
			System.out.print("\n");
	}
}