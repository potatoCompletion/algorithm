import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int x = Integer.parseInt(br.readLine());
            String numString = br.readLine();
            int sum = 0;

            for (int i = 0; i < x; i++) {
                sum += Integer.parseInt(String.valueOf(numString.charAt(i)));
            }

            System.out.println(sum);
        }
    }
}