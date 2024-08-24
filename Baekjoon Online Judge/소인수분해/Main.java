import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());

            if (n == 1) {
                return;
            }

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            boolean isFinish = false;

            while (!isFinish) {
                for (int i = 2; i <= n; i++) {
                    if (n % i == 0) {
                        bw.write(i + "\n");

                        if (n == i) {
                            isFinish = true;
                            break;
                        }

                        n /= i;
                        break;
                    }
                }
            }

            bw.flush();
            bw.close();
        }
    }
}