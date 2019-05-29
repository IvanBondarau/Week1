package week1.tasks.looping;

public class Task3 {
    public static void main(String[] args) {
        int ans = 0;
        for (int i = 1; i <= 100; i++) {
            ans += i*i;
        }
        System.out.println(ans);
    }
}
