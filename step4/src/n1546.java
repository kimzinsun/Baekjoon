import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class n1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        double arr[] = new double[n];
        double max = 0;
        double sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Double.parseDouble(st.nextToken());
            if (arr[i] > max)
                max = arr[i];
        }
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] / max * 100;
            sum += arr[i];
        }
        bw.write(sum / n + " ");
        bw.flush();

    }
}
