package week1.tasks.looping;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a, b, h: ");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double h = in.nextDouble();

        double ans = 0;
        for (double x = a; x <= b; x += h) {
            ans += x > 2 ? x : -x;
        }

        System.out.println(ans);
    }
}
