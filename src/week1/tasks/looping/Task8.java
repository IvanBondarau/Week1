package week1.tasks.looping;

import java.util.Scanner;

public class Task8 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        String first = in.next();
        String second = in.next();

        int[] digits = new int[10];
        for (int i = 0; i < first.length(); i++) {
            if (!Character.isDigit(first.charAt(i))) {
                continue;
            }

            for (int j = 0; j < second.length(); j++) {
                if (first.charAt(i) == second.charAt(j)) {
                    digits[(int)first.charAt(i) - (int)'0']++;
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            if (digits[i] > 0) {
                System.out.print(i + " ");
            }
        }
    }
}
