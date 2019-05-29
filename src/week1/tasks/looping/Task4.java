package week1.tasks.looping;

import java.math.BigInteger;

public class Task4 {
    public static void main(String[] args) {
        BigInteger ans = new BigInteger("1");
        for (int i = 2; i <= 200; i++) {
            ans = ans.multiply(new BigInteger(Integer.toString(i*i)));
        }
        System.out.println(ans.toString());
    }

}
