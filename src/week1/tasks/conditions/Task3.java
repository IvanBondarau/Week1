package week1.tasks.conditions;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first point: ");
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();

        System.out.println("Enter the second point: ");
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();

        System.out.println("Enter the third point: ");
        double x3 = in.nextDouble();
        double y3 = in.nextDouble();

        boolean onLine = (x1-x3) / (x2-x3) == (y1-y3) / (y2-y3);
        System.out.println(onLine ? "Yes" : "No");

    }
}