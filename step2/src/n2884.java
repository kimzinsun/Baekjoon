import java.util.Scanner;

public class n2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        if (m < 45) {
            h = h - 1;
            if (h < 0)
                h = 23;
            m = 60 + (m - 45);
        } else {
            m = m - 45;
        }
        System.out.println(h + " " + m);

    }
}
