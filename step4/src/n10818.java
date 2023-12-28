import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class n10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int max = -1000000, min = 1000000;
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(st.nextToken());
            if (a < min)
                min = a;
            if (a > max)
                max = a;
        }
        bw.write(min + " " + max);
        bw.flush();
    }
}
