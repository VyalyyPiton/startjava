package com.startjava.lesson_1.cycle;

public class Cycle {	
    public static void main(String[] args) {
        // Вывод на консоль с помощью цикла for все числа от [0, 20]
        System.out.print("\n");
        System.out.print("Целые числа от 0 до 20: ");
        for (int i = 0; i <= 20; i++) {
            if (i < 20)  {
                System.out.print(i + ", ");
            } else { 
                System.out.print(i);
            }            
        }

        //Вывод на консоль с помощью цикла while всех чисел от [6, -6] (шаг итерации равен 2)
        System.out.println("\n");
        System.out.print("Целые числа от 6 до -6 с шагом -2: ");
        int counter = 6;
        while (counter >= -6) {
            if (counter > -6) {
                System.out.print(counter + ", ");
            } else {
                System.out.print(counter);
            }
            counter -= 2;
        }

        // Вывод на консоль с помощью цикла do-while суммы всех нечетных чисел от [10, 20]
        System.out.println("\n");
        System.out.print("Сумма всех нечетных чисел от 10 до 20 равна: ");
        int sumOdd = 0;
        int counter1 = 10;
        do {
            if (counter1 % 2 != 0) {
                if (counter1 < 19) {
                    System.out.print(counter1 + " + ");
                } else {
                    System.out.print(counter1 + " = "); 
                }
                sumOdd += counter1;
            }
            counter1++;
        } while(counter1 < 20);
        System.out.print(sumOdd);
        System.out.println("\n");
    }
}