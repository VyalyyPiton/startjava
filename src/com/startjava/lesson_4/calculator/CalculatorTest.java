package com.startjava.lesson_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String answer = "y";
		String rightExpIntput = "(\\d+)(\\s)([+-/*^%])(\\s)(\\d+)";

		System.out.print("\n" + "                 --- Консольный калькулятор ---");
		System.out.print("\n" + "1) Допускается использование только положительных целых чисел.");
		System.out.print("\n" + "2) Мат. операция указывается с помощью одного из символов: +,-,*,/,^,%.");
		System.out.print("\n" + "3) Формат ввода выражения: 'Число1'<пробел>'Символ'<пробел>'Число2'" + "\n");

		while (answer.equalsIgnoreCase("y")) {
			System.out.print("\n" + "Введите математическое выражение: ");
			String expInput = scan.nextLine();
			while (!expInput.matches(rightExpIntput)) {
				System.out.print("Неправильный формат ввода выражения. Попробуйте еще раз: ");
				expInput = scan.nextLine();
			}

			Calculator calc = new Calculator(expInput);
			System.out.println("Результат: " + calc.getFirstNumber() + " " + calc.getOperation() + " " + calc.getSecondNumber() + " = " + calc.calculate());

			do {
				System.out.print("Хотите продолжить? [y/n]: ");
				answer = scan.nextLine();
			} while (!answer.equalsIgnoreCase("y") && !answer.equalsIgnoreCase("n"));
		}
	}
}