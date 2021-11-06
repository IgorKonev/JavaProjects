/*true если точка принадлежит закрашенной области, false в другом случае*/
package module_1;

public class Task1_6 {
    public static void main(String[] args) {
        int x = -1;
        int y = 4;
        boolean z;

    z = (x <= 2) && (x >= -2) && (y <= 4) && (y >= 0) || (x <= 4) && (x >= -4) && (y >= -3) && (y <= 0);

        System.out.println(z);
    }
}
