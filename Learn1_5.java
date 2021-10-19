package com.company;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Learn1_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("vvedite chislo (sekund): ");
        DecimalFormat frm = new DecimalFormat("00"); // формат HH MM SS
        int a = scan.nextInt();
        int b = a / 3600; // 1 час == 3600 сек

        if (b < 1) {  //число меньше часа
            int b1 = a / 60;
                if (b1 < 1) { //число меньше минуты
                b1 = a % 60;
                System.out.println("00" + "ч " + "00" + "мин " + frm.format(b1) + "c");
                }
                else {
                    int b2 = a % 60;
                    System.out.println("00" + "ч " + frm.format(b1) + "мин " + frm.format(b2) + "c");
                }
        }
        else { // число больше часа
            int c = a % 3600;
            if (c < 60) { // остаток секунд меньше минуты
                System.out.println(frm.format(b) + "ч " + "00" + "мин " + frm.format(c) + "c");
            }
            else { //остаток минут + остаток секунд
                int c1 = c / 60;
                int c2 = c % 60;
                System.out.println(frm.format(b) + "ч " + frm.format(c1) + "мин " + frm.format(c2) + "c");
            }
        }
        scan.close();
    }
}
