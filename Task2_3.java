/*Даны три точки, определить будут ли они расположены на одной прямой*/
package module_1;

public class Task2_3 {
    public static void main(String[] args) {
        //(x1 - x3)(y2 - y3)-(x2 - x3)(y1 - y3) = 0, если точки лежат на одной прямой, то S треугольника == 0
        int x1 = -1;
        int y1 = -1;
        int x2 = 0;
        int y2 = 0;
        int x3 = 1;
        int y3 = 1;
        int z;

        z = (x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3);

        if (z == 0){
            System.out.println("leshat");
        } else {
            System.out.println("Ne leshat");
        }
    }
}

