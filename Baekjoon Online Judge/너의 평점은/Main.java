import java.io.*;
import java.math.BigDecimal;
import java.util.StringTokenizer;

public class Main {
    private static final String PASS_CODE = "9.9";

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line = br.readLine();

            BigDecimal total = new BigDecimal(0);
            BigDecimal sum = new BigDecimal(0);

            while(line != null) {
                StringTokenizer st = new StringTokenizer(line, " ");
                st.nextToken();
                BigDecimal score = new BigDecimal(st.nextToken());
                BigDecimal grade = new BigDecimal(getGradeNumByGradeChar(st.nextToken()));

                total = total.add(score.multiply(grade));
                sum = sum.add(score);

                line = br.readLine();
            }

            System.out.println(total.divide(sum).doubleValue());
        }
    }

    private static String getGradeNumByGradeChar(String grade) {
        switch (grade) {
            case "A+":
                return "4.5";
            case "A0":
                return "4.0";
            case "B+":
                return "3.5";
            case "B0":
                return "3.0";
            case "C+":
                return "2.5";
            case "C0":
                return "2.0";
            case "D+":
                return "1.5";
            case "D0":
                return "1.0";
            case "F":
                return "0.0";
            default:
                return PASS_CODE;
        }
    }
}