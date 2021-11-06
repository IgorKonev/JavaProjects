/*Дано действительное число вида R вида nnn.ddd (три цифровых разряда в дробной и целой части). Поменять
* местами дробную и целую часть числа и вывести полученное значение*/
package module_1;
import java.util.Scanner;

public class Task1_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Vvedite chislo formata nnn.ddd : ");

        double a = scan.nextDouble();

        int b = (int) a;
        double c = a / 1000 + (a - b) * 1000;

        System.out.println((int) c + "." + b);

        scan.close();
    }
}
