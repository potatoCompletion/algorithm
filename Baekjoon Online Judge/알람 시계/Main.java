import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            LocalTime localTime = LocalTime.of(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            localTime = localTime.minusMinutes(45);

            int hour = localTime.getHour();
            int minute = localTime.getMinute();

            System.out.println(hour + " " + minute);
        }
    }
}