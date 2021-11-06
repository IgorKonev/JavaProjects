/*Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести значение
* в часах минутах секундах в формате ННч ММмин SSс*/
package module_1;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Task1_5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("vvedite chislo (sekund): ");

        DecimalFormat frm = new DecimalFormat("00"); // формат HH MM SS
        int a = scan.nextInt();

        int b = a / 3600;
        int c = a % 3600;

        int c1 = c / 60;
        int f = c % 60;

        System.out.println(frm.format(b) + "ч " + frm.format(c1) + "мин " + frm.format(f) + "c");
        scan.close();
    }
    }
