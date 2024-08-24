import java.io.*;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            List<String> croatia = List.of("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=");

            String s = br.readLine();

            for(String cro : croatia) {
                s = s.replace(cro, String.valueOf(croatia.indexOf(cro)));
            }

            System.out.println(s.length());
        }
    }
}