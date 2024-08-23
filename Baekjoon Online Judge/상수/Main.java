import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String str = br.readLine();
            Character[] reverseArray = new Character[str.length()];
            StringBuilder sb = new StringBuilder();

            for (int i = str.length() - 1; i >= 0; i--) {
                sb.append(str.charAt(i));
            }

            StringTokenizer st = new StringTokenizer(sb.toString(), " ");

            System.out.println(Math.max(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }
    }
}