package com.startjava.lesson_1.conditionalstatement;

public class ConditionalStatement {	
    public static void main(String[] args) {
        int age = 99;
        if (age > 20)  {
            System.out.println("Ваш возраст больше 20 лет");
        }
        
        boolean isMan = true;
        if (isMan)  {
            System.out.println("Вы мужчина");
        }
        if (!isMan)  {
            System.out.println("Вы женщина");
        }

        int height = 216;
        if (height > 180)  {
            System.out.println("Ваш рост больше 180 см");
        } else { 
            System.out.println("Ваш рост меньше 180 см");
        }

        char firstLetterInName = 'M';
        if (firstLetterInName == 'M')  {
            System.out.println("Ваше имя начинается на букву 'M'");
        } else if (firstLetterInName == 'I') {
            System.out.println("Ваше имя начинается на букву 'I'");
        } else {
            System.out.println("WTF... Ваше имя начинается непонятно на что ))");
        }
    }
}