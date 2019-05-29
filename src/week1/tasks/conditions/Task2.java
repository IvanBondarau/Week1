package week1.tasks.conditions;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a, b, c, d: ");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double d = in.nextDouble();

        double minab = a < b ? a : b;
        double mincd = c < d ? c : d;
        double max = minab > mincd ? minab : mincd;

        System.out.println(max);
    }
}
