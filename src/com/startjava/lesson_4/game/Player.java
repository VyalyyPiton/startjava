package com.startjava.lesson_4.game;

import java.util.Arrays;

public class Player {
	private String name;
	private int[] enteredNumbers = new int[10];
	private boolean isWin;

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public boolean isWin() {
		return isWin;
	}

	public void setWin(boolean isWin) {
		this.isWin = isWin;
	}

	public void setNumber(int attempt, int number) {
		this.enteredNumbers[attempt] = number;
	}

	public int getNumber(int attempt) {
		return enteredNumbers[attempt];
	}

	public void resetEnteredNumber(int attempt) {
		Arrays.fill(enteredNumbers, 0, attempt, 0);
	}

	public int[] getEnteredNumbers(int attempt) {
		return Arrays.copyOf(enteredNumbers, attempt);
	}
}
