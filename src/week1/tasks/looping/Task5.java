package week1.tasks.looping;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.abs;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter e: ");
        double eps = in.nextDouble();

        double sum = 0, lastMember = 0, n = 0;
        do
        {
            n++;
            lastMember = 1.d / pow(2, n) + 1.d / pow(3, n);
            sum += lastMember;
        }
        while (abs(lastMember) >= eps && lastMember != 0.0d);
        sum -= lastMember;

        System.out.println(sum);
    }
}
