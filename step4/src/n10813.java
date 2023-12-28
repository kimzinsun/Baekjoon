import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class n10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int arr[] = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = i;
        }
        for (int i = 0; i < m; i++) {
            int temp;
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }
        for (int i = 1; i <= n; i++) {
            bw.write(arr[i] + " ");
        }
        bw.flush();
    }
}
