import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String s = br.readLine();

            int[] alphabetArray = new int[26];

            for (int i = 0; i < alphabetArray.length; i++) {
                alphabetArray[i] = -1;
            }

            for (int i = 0; i < s.length(); i++) {
                char now = s.charAt(i);
                int index = now - 97;

                if (alphabetArray[index] == -1) {
                    alphabetArray[index] = i;
                }
            }

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            for (int i : alphabetArray) {
                bw.write(i + " ");
            }

            bw.flush();
            bw.close();
        }
    }
}