import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int testCaseNum = Integer.parseInt(br.readLine());
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            for (int i = 0; i < testCaseNum; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                int repeatNum = Integer.parseInt(st.nextToken());
                String str = st.nextToken();

                for (int j = 0; j < str.length(); j++) {
                    for (int k = 0; k < repeatNum; k++) {
                        bw.write(str.charAt(j));
                    }
                }

                bw.flush();
                bw.write("\n");
                bw.flush();
            }

            bw.close();
        }
    }
}