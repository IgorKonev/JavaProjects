/*Даны 2 угла в градусах. Определить существует ли такой треугольник и если да является ли он
* прямоугольным*/
package module_1;
import java.util.Scanner;

public class Task2_1 {
    public static void main(String[] args) {
        System.out.println("Vvedite ygol № 1 : ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        System.out.println("Vvedite ygol № 2 : ");
        Scanner scan1 = new Scanner(System.in);
        int b = scan1.nextInt();

        int c = a + b;

        if (c < 180 && a > 0 && b > 0) {
            System.out.println("Tr Sushestvuet");

            if (a == 90 || b == 90){
                System.out.println("Tr pryamougolny");

            } else {
                System.out.println("Tr NE pryamougolny");
            }

        } else {
            System.out.println("Tr ne Sushestvuet");
        }
        scan.close();
        scan1.close();
        }
    }
