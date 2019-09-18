package com.startjava.lesson_2_3.robot;

public class JaegerTest {

	public static void main(String[] args) {
		
		Jaeger jaeger1 = new Jaeger("Romeo Blue", "Mark-1", "USA", 77.72f, 7.775f, 2, 7, 6);
		/*Jaeger jaeger1 = new Jaeger();
		jaeger1.setModelName("Romeo Blue");
		jaeger1.setMark("Mark-1");
		jaeger1.setOrigin("USA");
		jaeger1.setHeight(77.72f);
		jaeger1.setWeight(7.775f);
		jaeger1.setSpeed(2);
		jaeger1.setStrenght(7);
		jaeger1.setArmor(6);*/

		Jaeger jaeger2 = new Jaeger("Tacit Ronin", "Mark-1", "Japan", 74.37f, 7.450f, 8, 7, 3);
		/*Jaeger jaeger2 = new Jaeger();
		jaeger2.setModelName("Tacit Ronin");
		jaeger2.setMark("Mark-1");
		jaeger2.setOrigin("Japan");
		jaeger2.setHeight(74.37f);
		jaeger2.setWeight(7.450f);
		jaeger2.setSpeed(8);
		jaeger2.setStrenght(7);
		jaeger2.setArmor(3);*/

		System.out.println("\n" + "Вывод информации по роботам:" + "\n");		
		System.out.println("Название: " + jaeger1.getModelName());
		System.out.println("Серия:    " + jaeger1.getMark());
		System.out.println("Страна:   " + jaeger1.getOrigin());
		System.out.println("Рост:     " + jaeger1.getHeight());
		System.out.println("Вес:      " + jaeger1.getWeight());
		System.out.println("Скорость: " + jaeger1.getSpeed());
		System.out.println("Сила:     " + jaeger1.getStrenght());
		System.out.println("Защита:   " + jaeger1.getArmor());
		System.out.print("Последняя запись в логах: ");
		jaeger1.move();
		System.out.println("\n");
		System.out.println("Название: " + jaeger2.getModelName());
		System.out.println("Серия:    " + jaeger2.getMark());
		System.out.println("Страна:   " + jaeger2.getOrigin());
		System.out.println("Рост:     " + jaeger2.getHeight());
		System.out.println("Вес:      " + jaeger2.getWeight());
		System.out.println("Скорость: " + jaeger2.getSpeed());
		System.out.println("Сила:     " + jaeger2.getStrenght());
		System.out.println("Защита:   " + jaeger2.getArmor());
		System.out.print("Последняя запись в логах: ");
		jaeger2.drift();
	}
}