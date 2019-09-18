package com.startjava.lesson_1.variable;

public class Variable {	
    public static void main(String[] args) {
    	byte cpuCore = 4;
    	short memSize = 4096;
    	int hddSize = 245760; 
        long hddSizeInByte = 257698037760l;
    	float cpuFreq = 1.6f;
    	double hddFreeSpacePerc = 19.49; 
    	char sysLetter = 'C';
    	boolean isWarranty = false;

    	System.out.println("");
    	System.out.println("Технические хар-ки ПК Вялого Питона");
    	System.out.println("-----------------------------------------------");
    	System.out.println("Кол-во процессорных ядер:      " + cpuCore + " шт.");
    	System.out.println("Тактовая частота процессора:   " + cpuFreq + " ГГц");
    	System.out.println("Кол-во оперативной памяти:     " + memSize + " МБайт");
    	System.out.println("Объем жесткого диска:          " + hddSize + " МБайт");
    	System.out.println("Объем жесткого диска в байтах: " + hddSizeInByte + " Байт");
    	System.out.println("Свободное место на диске:      " + hddFreeSpacePerc + " %");
    	System.out.println("ОС Windows установлена на:     " + sysLetter + ":\\");
    	System.out.println("ПК на гарантии:                " + isWarranty);
    	System.out.println("-----------------------------------------------");
    	System.out.println("");
    }
}