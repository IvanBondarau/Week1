package week1.tasks.linear;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number: ");
        long x = in.nextLong();
        String ans = String.format("%02dч %02dмин %02dс", x/3600, x%3600/60, x%60);
        System.out.println(ans);
    }
}
