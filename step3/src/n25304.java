import java.util.Scanner;

public class n25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            sum += a * b;
        }
        if (sum == x)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
