import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String str = br.readLine();
            int time = 0;

            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);

                switch (c) {
                    case 'A':
                    case 'B':
                    case 'C':
                        time += 3;
                        break;
                    case 'D':
                    case 'E':
                    case 'F':
                        time += 4;
                        break;
                    case 'G':
                    case 'H':
                    case 'I':
                        time += 5;
                        break;
                    case 'J':
                    case 'K':
                    case 'L':
                        time += 6;
                        break;
                    case 'M':
                    case 'N':
                    case 'O':
                        time += 7;
                        break;
                    case 'P':
                    case 'Q':
                    case 'R':
                    case 'S':
                        time += 8;
                        break;
                    case 'T':
                    case 'U':
                    case 'V':
                        time += 9;
                        break;
                    default:
                        time += 10;
                        break;
                }
            }

            System.out.println(time);
        }
    }
}