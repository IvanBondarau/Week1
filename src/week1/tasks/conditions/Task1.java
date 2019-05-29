package week1.tasks.conditions;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter two angles: ");
        double firstAngle = in.nextDouble();
        double secondAngle = in.nextDouble();

        if (firstAngle > 0 & secondAngle > 0 && firstAngle + secondAngle < 180) {
            System.out.print("Triangle exists");
            double thirdAngle = 180 - firstAngle - secondAngle;
            if (firstAngle == 90 || secondAngle == 90 || thirdAngle == 90) {
                System.out.println(", rectangular triangle");
            }
        } else {
            System.out.println("Triangle doesn't exist");
        }
    }
}
