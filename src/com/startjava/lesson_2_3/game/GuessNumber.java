package com.startjava.lesson_2_3.game;

import java.util.Scanner;

public class GuessNumber {
	Scanner scan = new Scanner(System.in);
	private Player playerOne;
	private Player playerTwo;	

	public GuessNumber(Player playerOne, Player playerTwo) {
		this.playerOne = playerOne;
		this.playerTwo = playerTwo;
	}
		
	public void start() {	
		int computerNumber = (int) (Math.random()*(101));

		while(true) {
			System.out.print("\n" + playerOne.getName() + ", " + "введите целое число от 0 до 100, которое по Вашему мнению загадал компьютер: ");
			while(!scan.hasNext("([0-9]|([1-9][0-9])|100)")) {
				System.out.print("Допускается ввод только целого числа от 0 до 100. " + playerOne.getName() + ", попробуйте еще раз (повторные попытки платные): "); 
				scan.next();
			}
			playerOne.setNumber(scan.nextInt());

			if (playerOne.getNumber() < computerNumber) {
				System.out.println("Мало! Компьютер загадал число больше и его сейчас будет пытаться угадать другой игрок.");
			} else if (playerOne.getNumber() > computerNumber) {
				System.out.println("Много! Компьютер загадал число меньше и его сейчас будет пытаться угадать другой игрок.");
			} else {
				System.out.println(playerOne.getName() +", поздравляем!!! Вы выиграли платную поездку на шарабане! Спонсор поездки: " + playerTwo.getName());
				break;
			}

			System.out.print("\n" + playerTwo.getName() + ", " + "введите целое число от 0 до 100, которое по Вашему мнению загадал компьютер: ");
			while(!scan.hasNext("([0-9]|([1-9][0-9])|100)")) {
				System.out.print("Допускается ввод только целого числа от 0 до 100. " + playerTwo.getName() + ", попробуйте еще раз (повторные попытки платные): "); 
				scan.next();
			}
			playerTwo.setNumber(scan.nextInt());

			if (playerTwo.getNumber() < computerNumber) {
				System.out.println("Мало! Компьютер загадал число больше и его сейчас будет пытаться угадать другой игрок.");
			} else if (playerTwo.getNumber() > computerNumber) {
				System.out.println("Много! Компьютер загадал число меньше и его сейчас будет пытаться угадать другой игрок.");
			} else {
				System.out.println(playerTwo.getName() +", поздравляем!!! Вы выиграли платную поездку на шарабане! Спонсор поездки: " + playerOne.getName());
				break;
			}	
		}
	}
}