import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());

            if (x == y && y == z) {
                System.out.println(10000 + x * 1000);
                return;
            }

            if (x == y || x == z) {
                System.out.println(1000 + x * 100);
                return;
            }

            if (y == z) {
                System.out.println(1000 + y * 100);
                return;
            }

            System.out.println(Math.max(Math.max(x, y), z) * 100);
        }
    }
}