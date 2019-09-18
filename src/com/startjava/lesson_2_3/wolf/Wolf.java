package com.startjava.lesson_2_3.wolf;

public class Wolf {
	
	private String sex;
	private String nick;
	private float weight;
	private int age;
	private String color;

	public String getSex() {
		return sex;
	}

	void setSex(String sex) {
		this.sex = sex;
	}

	public String getNick() {
		return nick;
	}

	void setNick(String nick) {
		this.nick = nick;
	}

	public float getWeight() {
		return weight;
	}

	void setWeight(float weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	void setAge(int age) {
		if(age > 8) {
			System.out.println("Некорректный возраст");
		} else {
			this.age = age;
		}
	}

	public String getColor() {
		return color;
	}

	void setColor(String color) {
		this.color = color;
	}

	public void go() {
		System.out.println("some go code here");
	}

	public void seat() {
		System.out.println("some seat code here");
	}

	public void run() {
		System.out.println("some run code here");
	}

	public void yowl() {
		System.out.print("Раздается вой волка )) Занавес.");
	}

	public void hunt() {
		System.out.println("some hunt code here");
	}
}