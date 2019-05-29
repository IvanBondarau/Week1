package week1.tasks.linear;

import java.util.Scanner;

import static java.lang.Math.abs;
import static java.lang.Math.pow;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter point's coordinates: ");
        double x = in.nextDouble();
        double y = in.nextDouble();
        boolean firstRectangle = (x >= -2) && (x <= 2) && (y >= 0) && (y <= 4);
        boolean secondRectangle = (y >= -3) && (y <= 0) && (abs(x) <= 5);
        boolean circle = (pow(x, 2) + pow(y+1, 2)) <= 1;
        System.out.println(firstRectangle || (secondRectangle && !circle));
    }
}
