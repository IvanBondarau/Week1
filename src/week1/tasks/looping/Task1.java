package week1.tasks.looping;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter natural number: ");
        int n = in.nextInt();

        long ans = 0;
        for (int i = 1; i <= n; i++) {
            ans += i;
        }

        System.out.println(ans);
    }
}
