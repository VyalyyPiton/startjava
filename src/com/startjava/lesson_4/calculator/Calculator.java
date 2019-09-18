package com.startjava.lesson_4.calculator;

public class Calculator {
 	private String mathExp;
	private int firstNumber;
	private int secondNumber;
	private char operation;

	public Calculator(String mathExp) {
		this.mathExp = mathExp;
	}

	public int getFirstNumber() {
		return firstNumber;
	}

	public int getSecondNumber() {
		return secondNumber;
	}

	public char getOperation() {
		return operation;
	}

	public int calculate() {
		String[] partsOfMathExp = mathExp.split(" ");
		firstNumber = Integer.parseInt(partsOfMathExp[0]);
		secondNumber = Integer.parseInt(partsOfMathExp[2]);
		operation = partsOfMathExp[1].charAt(0);

		switch(operation) {
			case '+':
				return Math.addExact(firstNumber, secondNumber);
			case '-':
				return Math.subtractExact(firstNumber, secondNumber);
			case '*':
				return Math.multiplyExact(firstNumber, secondNumber);
			case '/':
				return Math.floorDiv(firstNumber, secondNumber);
			case '^':
				return (int)(Math.pow((double)firstNumber, (double)secondNumber));
			case '%':
				return (int)(Math.IEEEremainder((double)firstNumber, (double)secondNumber));
			default:
				return 0;
		}
	}
}