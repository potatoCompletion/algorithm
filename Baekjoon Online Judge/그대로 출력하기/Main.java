import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            String s = br.readLine();

            while(s != null) {
                bw.write(s + "\n");
                s = br.readLine();
            }

            bw.flush();
            bw.close();
        }
    }
}