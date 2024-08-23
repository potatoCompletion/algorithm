import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());

            int[] A = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            Arrays.sort(A);

            int[] B = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            List<Integer> BList = new LinkedList<>();

            for (int i : B) {
                BList.add(i);
            }

            int sum = 0;
            for (int i = 0; i < n; i++) {
                int maxIndex = 0;

                for (int j : BList) {
                    if (BList.get(maxIndex) < j) {
                        maxIndex = BList.indexOf(j);
                    }
                }

                sum += A[i] * BList.get(maxIndex);
                BList.remove(maxIndex);
            }

            System.out.println(sum);
        }
    }
}