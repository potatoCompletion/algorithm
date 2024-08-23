import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String s = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(s, " ");
            System.out.println(st.countTokens());
        }
    }
}