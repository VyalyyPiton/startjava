package com.startjava.lesson_4.game;

import java.util.Scanner;

public class GuessNumberTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String answer = "y";

		System.out.println("\n" + "--- Угадай число ---");

		System.out.print("\n" + "Первый игрок, введите Ваше имя: ");
		Player playerOne = new Player(scan.next());

		System.out.print("\n" + "Второй игрок, введите Ваше имя: ");
		Player playerTwo = new Player(scan.next());

		GuessNumber guessGame = new GuessNumber(playerOne, playerTwo);

		while (answer.equalsIgnoreCase("y")) {
			guessGame.start();
			do {
				System.out.print("\n" + "Хотите продолжить игру? [y/n]: ");
				answer = scan.next();
			} while (!answer.equalsIgnoreCase("y") && !answer.equalsIgnoreCase("n"));
		}
	}
}