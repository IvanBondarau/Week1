package week1.tasks.conditions;

import java.util.Scanner;

public class Task4 {
    private static double a;
    private static double b;

    private static boolean check(double x, double y) {
        return (x <= a && y <= b) || (y <= a && x <= b);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter A, B: ");
        a = in.nextDouble();
        b = in.nextDouble();

        System.out.println("Enter x, y, z: ");
        double x = in.nextDouble();
        double y = in.nextDouble();
        double z = in.nextDouble();

        boolean ans = check(x, y) || check(x, z) || check(y, z);
        System.out.println(ans ? "Yes": "No ");
    }
}