import java.util.Scanner;

public class n2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        b = b + c;
        if (b >= 60) {
            a = a + (b / 60);
            b %= 60;
        }
        if (a >= 24) {
            a -= 24;
        }
        System.out.println(a + " " + b);
    }
}
