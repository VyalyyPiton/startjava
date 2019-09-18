package com.startjava.lesson_4.game;

import java.util.Scanner;

public class GuessNumber {
	private Scanner scan = new Scanner(System.in);
	private Player playerOne;
	private Player playerTwo;
	private int tryNum;
	private int computerNumber;
	private boolean isGuessed;

	public GuessNumber(Player playerOne, Player playerTwo) {
		this.playerOne = playerOne;
		this.playerTwo = playerTwo;
	}
		
	public void start() {	
		init();
		while(!isGuessed && tryNum < 10) {
				inputNumber(playerOne);
				compareNumbers(playerOne);
				if (!isGuessed) {
					inputNumber(playerTwo);
					compareNumbers(playerTwo);
				}
				tryNum++;
		}
		showEnteredNumbers();
	}

	private void init() {
		playerOne.resetEntered(tryNum);
		playerTwo.resetEntered(tryNum);
		tryNum = 0;
		isGuessed = false;
		computerNumber = (int) (Math.random()*(101));
	}

	private void inputNumber(Player player) {
		System.out.print("\n" + player.getName() + ", " + "введите целое число от 0 до 100, которое по Вашему мнению загадал компьютер (попытка " + (tryNum + 1) + "): ");
		while(!scan.hasNext("([0-9]|([1-9][0-9])|100)")) {
			System.out.print("Допускается ввод только целого числа от 0 до 100. " + player.getName() + ", попробуйте еще раз (повторные попытки платные): ");
			scan.next();
		}
		player.setNumber(tryNum, scan.nextInt());
	}

	private void compareNumbers(Player player) {
		if (player.getNumber(tryNum) < computerNumber) {
			System.out.println("Мало! Компьютер загадал число больше.");
		} else if (player.getNumber(tryNum) > computerNumber) {
			System.out.println("Много! Компьютер загадал число меньше.");
		} else {
			isGuessed = true;
			player.setWinner(isGuessed);
			System.out.println(player.getName() + ", поздравляем!!! Вы угадали число " + computerNumber + " c попытки № " + (tryNum + 1) + ". Чаевые приветствуются!");
		}
	}

	private void showEnteredNumbers() {
		if (tryNum > 9) {
			System.out.println("\n" + "---------------------------------------------------------------------------------------");
			System.out.println("Эхх...Никому не удалось угадать число " + computerNumber + " за " + tryNum + " попыток.");
			System.out.println("\n" + playerOne.getName() + ", Вы были первым и вводили числа: " + playerOne.printEntered(tryNum));
			System.out.println("\n" + playerTwo.getName() + ", Вы были вторым и вводили числа: " + playerTwo.printEntered(tryNum));
			System.out.println("---------------------------------------------------------------------------------------");
		} else if(playerOne.isWinner()) {
			System.out.println("\n" + "---------------------------------------------------------------------------------------");
			System.out.println("Ого, у нас есть победитель: " + playerOne.getName() + ". Вот как развивались события до угадывания числа " + computerNumber + "...");
			System.out.println("\n" + playerOne.getName() + ", Вы были первым и на пути у успеху вводили числа: " + playerOne.printEntered(tryNum));
			System.out.println("\n" + playerTwo.getName() + ", Вы были вторым и сделали на один ход меньше и успели ввести: " + playerTwo.printEntered(tryNum-1));
			System.out.println("---------------------------------------------------------------------------------------");
		} else {
			System.out.println("\n" + "---------------------------------------------------------------------------------------");
			System.out.println("Ого, у нас есть победитель: " + playerTwo.getName() + ". Вот как развивались события до угадывания числа " + computerNumber + "...");
			System.out.println("\n" + playerOne.getName() + ", Вы были первым, но чуть-чуть не хватило для победы. Вот Ваши попытки: " + playerOne.printEntered(tryNum));
			System.out.println("\n" + playerTwo.getName() + ", Вы были вторым, но отгадали число первым. Вот Ваш путь к победе: " + playerTwo.printEntered(tryNum));
			System.out.println("---------------------------------------------------------------------------------------");
		}
	}
}