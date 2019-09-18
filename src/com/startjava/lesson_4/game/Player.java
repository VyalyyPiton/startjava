package com.startjava.lesson_4.game;

import java.util.Arrays;

public class Player {
	private String name;
	private int[] enteredNumbers = new int[10];
	private boolean winner;

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public boolean isWinner() {
		return winner;
	}

	public void setWinner(boolean winner) {
		this.winner = winner;
	}

	public void setNumber(int tryNum, int number) {
		this.enteredNumbers[tryNum] = number;
	}

	public int getNumber(int tryNum) {
		return enteredNumbers[tryNum];
	}

	public void resetEntered(int tryNum) {
		Arrays.fill(enteredNumbers, 0, tryNum, 0);
	}

	public String printEntered(int tryNum) {
		return Arrays.toString(Arrays.copyOf(enteredNumbers, tryNum));
	}
}
