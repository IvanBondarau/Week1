package week1.tasks.linear;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please, enter a, b, c: ");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();

        double z = (b + Math.sqrt(b*b + a*c*4)) / (a * 2) - a*a*a*c + Math.pow(b, -2);
        System.out.println("z = " + z);

    }
}
