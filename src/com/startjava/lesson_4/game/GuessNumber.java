package com.startjava.lesson_4.game;

import java.util.Scanner;
import java.util.Arrays;

public class GuessNumber {
	private Scanner scan = new Scanner(System.in);
	private Player playerOne;
	private Player playerTwo;
	private int attempt;
	private int computerNumber;
	private boolean isGuessed;
	private int attemptCorrection = 0;

	public GuessNumber(Player playerOne, Player playerTwo) {
		this.playerOne = playerOne;
		this.playerTwo = playerTwo;
	}
		
	public void start() {	
		init();
		while(!isGuessed && attempt < 10) {
			inputNumber(playerOne);
			compareNumbers(playerOne);
			if (!isGuessed) {
				inputNumber(playerTwo);
				compareNumbers(playerTwo);
			}
			attempt++;
		}
		showEnteredNumbers();
	}

	private void init() {
		playerOne.resetEnteredNumbers(attempt);
		playerTwo.resetEnteredNumbers(attempt);
		attempt = 0;
		attemptCorrection = 0;
		isGuessed = false;
		computerNumber = (int) (Math.random()*(101));
	}

	private void inputNumber(Player player) {
		System.out.print("\n" + player.getName() + ", " + "введите целое число от 0 до 100, которое по Вашему мнению загадал компьютер (попытка " + (attempt + 1) + "): ");
		while(!scan.hasNext("([0-9]|([1-9][0-9])|100)")) {
			System.out.print("Допускается ввод только целого числа от 0 до 100. " + player.getName() + ", попробуйте еще раз (повторные попытки платные): ");
			scan.next();
		}
		player.setNumber(attempt, scan.nextInt());
	}

	private void compareNumbers(Player player) {
		if (player.getNumber(attempt) < computerNumber) {
			System.out.println("Мало! Компьютер загадал число больше.");
		} else if (player.getNumber(attempt) > computerNumber) {
			System.out.println("Много! Компьютер загадал число меньше.");
		} else {
			isGuessed = true;
			player.setWin(isGuessed);
			System.out.println(player.getName() + ", поздравляем!!! Вы угадали число " + computerNumber + " c попытки № " + (attempt + 1) + ". Чаевые приветствуются!");
		}
	}

	private void showEnteredNumbers() {
		System.out.println("\n" + "---------------------------------------------------------------------------------------");
		if (attempt >= 10) {
			System.out.println("Эхх...Никому не удалось угадать число " + computerNumber + " за " + attempt + " попыток.");
		} else if(playerOne.isWin()) {
			System.out.println("Ого, у нас есть победитель: " + playerOne.getName() + ". Вот как развивались события до угадывания числа " + computerNumber + "...");
			attemptCorrection = 1;
		} else {
			System.out.println("Ого, у нас есть победитель: " + playerTwo.getName() + ". Вот как развивались события до угадывания числа " + computerNumber + "...");
		}
		System.out.println("\n" + playerOne.getName() + ", Вы были первым и вводили числа: " + Arrays.toString(playerOne.getEnteredNumbers(attempt)));
		System.out.println("\n" + playerTwo.getName() + ", Вы были вторым и вводили числа: " + Arrays.toString(playerTwo.getEnteredNumbers(attempt - attemptCorrection)));
		System.out.println("---------------------------------------------------------------------------------------");
	}
}