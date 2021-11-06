/*Вычислить значение выражения по формуле (переменные принимают действ.значения)*/
package module_1;

import java.util.Scanner;

public class Task1_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("vvedite a : ");
        double a = scan.nextDouble();

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Vvedite b : ");
        double b = scan1.nextDouble();

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Vvedite c : ");
        double c = scan2.nextDouble();

        double z1 = b + Math.sqrt(b * b + 4 * a * c);
        double z2 = Math.pow(a, 3) * c + Math.pow(b, -2);

        double z = z1 / (2 * a) - z2;
        System.out.printf("Rezult -> %.3f", z);

        scan.close();
        scan1.close();
        scan2.close();
    }
}
