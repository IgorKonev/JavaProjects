/*Вычислить значение выражения по формуле (переменные принимают действ.значения)*/
package module_1;

import java.util.Scanner;

public class Task1_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Vvedite x : ");
        double x = scan.nextDouble();

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Vvedite y : ");
        double y = scan1.nextDouble();

        double z = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y));
        double z1 = z * Math.tan(x * y);

        System.out.printf("Rezult -> %.6f", z1);

        scan.close();
        scan1.close();

    }
}
