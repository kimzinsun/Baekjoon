import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class n11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            // sum += str.charAt(i) - '0';
            sum += Character.getNumericValue(str.charAt(i));
        }
        bw.write(sum + " ");
        bw.flush();

    }
}
