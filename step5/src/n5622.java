import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class n5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char arr[] = br.readLine().toCharArray();
        int time = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'A' || arr[i] == 'B' || arr[i] == 'C') {
                time += 1;
            } else if (arr[i] == 'D' || arr[i] == 'E' || arr[i] == 'F') {
                time += 2;
            } else if (arr[i] == 'G' || arr[i] == 'H' || arr[i] == 'I') {
                time += 3;
            } else if (arr[i] == 'J' || arr[i] == 'K' || arr[i] == 'L') {
                time += 4;
            } else if (arr[i] == 'M' || arr[i] == 'N' || arr[i] == 'O') {
                time += 5;
            } else if (arr[i] == 'P' || arr[i] == 'Q' || arr[i] == 'R' || arr[i] == 'S') {
                time += 6;
            } else if (arr[i] == 'T' || arr[i] == 'U' || arr[i] == 'V') {
                time += 7;
            } else if (arr[i] == 'W' || arr[i] == 'X' || arr[i] == 'Y' || arr[i] == 'Z') {
                time += 8;
            } else if (arr[i] == 'A' || arr[i] == 'B' || arr[i] == 'C') {
                time += 9;
            }
            time += 2;
        }
        System.out.println(time);
    }
}
