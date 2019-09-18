package com.startjava.lesson_2_3.wolf;

class WolfTest {

	public static void main(String[] args){
		Wolf wolf1 = new Wolf();
		wolf1.setSex ("Мужской");
		wolf1.setNick ("Зорро");
		wolf1.setWeight (51.5f);
		wolf1.setAge(9);
		wolf1.setColor ("Черный");

		System.out.println("Пол волка экз.#1:     " + wolf1.getSex());
		System.out.println("Кличка волка экз.#1:  " + wolf1.getNick());
		System.out.println("Вес волка экз.#1:     " + wolf1.getWeight());
		System.out.println("Возраст волка экз.#1: " + wolf1.getAge());
		System.out.println("Окрас волка экз.#1:   " + wolf1.getColor());
		wolf1.yowl();
	}
}