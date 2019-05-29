package week1.tasks.looping;

import java.util.Scanner;

public class Task7 {
    private static void printDivisors(int num) {
        System.out.println(num + ":");
        int divisors = 0;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
                divisors++;
            }
        }
        if (divisors == 0) {
            System.out.println("Prime");
        } else {
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter m, n");
        int m = in.nextInt();
        int n = in.nextInt();

        for (int num = m; num <= n; num++) {
            printDivisors(num);
        }
    }
}
