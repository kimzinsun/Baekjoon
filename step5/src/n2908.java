import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        char[] arr1 = st.nextToken().toCharArray();
        char[] arr2 = st.nextToken().toCharArray();
        int a = (arr1[2] - '0') * 100 + (arr1[1] - '0') * 10 + (arr1[0] - '0');
        int b = (arr2[2] - '0') * 100 + (arr2[1] - '0') * 10 + (arr2[0] - '0');
        if (a > b)
            System.out.println(a);
        else
            System.out.println(b);
    }
}
