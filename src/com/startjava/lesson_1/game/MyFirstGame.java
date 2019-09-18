package com.startjava.lesson_1.game;

class MyFirstGame {
	public static void main(String[] args){
		long rangeBegin = 0L;
		long rangeEnd = 100L;
		long currentTime = System.currentTimeMillis();
		int randNum = (int)(rangeBegin + currentTime % (rangeEnd - rangeBegin));
		System.out.println("\n" + "--- Угадай число ---");
		System.out.println("\n" + "Ваш компьютер уже успел загадать целое число от 0 до 100, которое вам необходимо угадать. По секрету: " + randNum + ".");
		int tryNum = 55;
		System.out.println("Вы выбрали число: " + tryNum);
		int curBegin = (int)rangeBegin;
		int curEnd = (int)rangeEnd;
		do {
			if(tryNum < randNum) {
				curBegin = tryNum;
				tryNum = (curBegin + curEnd) / 2;
				System.out.println("Введенное вами число меньше того, что загадал компьютер. Ваш новый выбор: " + tryNum);
			} else {
				curEnd = tryNum;
				tryNum = (curBegin + curEnd) / 2;
				System.out.println("Введенное вами число больше того, что загадал компьютер. Ваш новый выбор: " + tryNum);
			}
		} while(tryNum != randNum);
		System.out.println("Вы угадали!" + "\n");
	}
}