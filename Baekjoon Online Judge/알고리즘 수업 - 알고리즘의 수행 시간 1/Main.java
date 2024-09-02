import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());
            int count = 0;
            int i = 0;

            do {
                i = n / 2;
                count++;
            } while(i > 0);

            int top = 4;

            if (count != 0 || count <= 4) {
                top = count - 1;
            }

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            bw.write(count + "\n" + top);
            bw.flush();
            bw.close();
        }
    }
}