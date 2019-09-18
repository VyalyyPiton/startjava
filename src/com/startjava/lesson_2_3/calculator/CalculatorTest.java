package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		Scanner scan = new Scanner(System.in);
		String answer = "y";
		//regex string for checking input positive int [0;2147483647]
		String regexCheckPosInt = "((0|1?[1-9][0-9]{0,8})|20[0-9]{8}|"
				+ "(21[0-3][0-9]{7})|(214[0-6][0-9]{6})|"
				+ "(2147[0-3][0-9]{5})|(21474[0-7][0-9]{4})|"
				+ "(214748[0-2][0-9]{3})|(2147483[0-5][0-9]{2})|"
				+ "(21474836[0-3][0-9])|(214748364[0-7]))";

		System.out.println("\n" + "--- Консольный калькулятор ---");

		while (answer.equalsIgnoreCase("y")) {
			System.out.print("\n" + "Введите первое число (целое > 0): ");
			while (!scan.hasNext(regexCheckPosInt)) {
				System.out.print("Допускается ввод только положительного целого числа. Попробуйте еще раз: ");
				scan.next();
			}
			calc.setFirstNumber(scan.nextInt());

			System.out.print("\n" + "Введите знак математической операции (+,-,*,/,^,%): ");
			while (!scan.hasNext("[+-/*^%]")) {
				System.out.print("Допускается ввод только одного из следующих символов: +,-,*,/,^,%. Попробуйте еще раз: ");
				scan.next();
			}
			calc.setOperation(scan.next().charAt(0));

			System.out.print("\n" + "Введите второе число (целое > 0): ");
			while (!scan.hasNext(regexCheckPosInt)) {
				System.out.print("Допускается ввод только положительного целого числа. Попробуйте еще раз: ");
				scan.next();
			}
			calc.setSecondNumber(scan.nextInt());

			int result = calc.calculate();
			System.out.println("Результат: " + calc.getFirstNumber() + " " + calc.getOperation() + " " + calc.getSecondNumber() + " = " + result);

			do {
				System.out.print("Хотите продолжить? [y/n]: ");
				answer = scan.next();
			} while (!answer.equalsIgnoreCase("y") && !answer.equalsIgnoreCase("n"));
		}
	}
}