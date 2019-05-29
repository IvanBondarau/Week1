package week1.tasks.linear;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);

        System.out.println("Enter the number: ");
        String inNumber = in.next();
        double outNumber = Double.valueOf(inNumber.substring(4) + "." + inNumber.substring(0, 3));
        System.out.println(outNumber);
    }
}