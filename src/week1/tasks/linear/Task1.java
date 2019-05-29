package week1.tasks.linear;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Calculating z = ((a - 3) * b / 2) + c");
        System.out.println("Please, enter a, b, c: ");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double z = ((a - 3) * b / 2) + c;
        System.out.println("z = " + z);
    }
}