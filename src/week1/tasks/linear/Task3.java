package week1.tasks.linear;

import java.util.Scanner;

import static java.lang.Math.sin;
import static java.lang.Math.cos;
import static java.lang.Math.tan;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter x, y:");
        double x = in.nextDouble();
        double y = in.nextDouble();

        double z = (sin(x) + cos(y)) / (cos(x) - sin(y)) * tan(x*y);
        System.out.println("z = " + z);
    }
}
