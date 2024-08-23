import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int hour = Integer.parseInt(st.nextToken());
            int minute = Integer.parseInt(st.nextToken());

            int needMinute = Integer.parseInt(br.readLine());

            while (needMinute != 0) {
                int remain = 60 - minute;

                if (needMinute < remain) {
                    minute += needMinute;
                    needMinute = 0;
                } else {
                    minute = 0;
                    needMinute -= remain;
                    hour++;
                }
            }

            if (hour >= 24) {
                hour -= 24;
            }
            System.out.println(hour + " " + minute);
        }
    }
}