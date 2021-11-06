/*Найти мах { min(a, b) min(c, d) }*/
package module_1;

public class Task2_2 {
    public static void main(String[] args) {
    int a = 1;
    int b = 2;
    int c = 3;
    int d = 4;

    int e = Math.min(a, b);
    int f = Math.min(c, d);

    int g = Math.max(e, f);

    System.out.println(g);
    }

}
