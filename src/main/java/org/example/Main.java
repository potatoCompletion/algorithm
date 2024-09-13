package org.example;

import java.lang.*;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int cardCount = Integer.parseInt(st.nextToken());
            int targetNumber = Integer.parseInt(st.nextToken());

            int[] cards = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int result = 0;

            for (int i = 0; i < cardCount - 2; i++) {
                for (int j = i + 1; j < cardCount - 1; j++) {
                    for (int k = j + 1; k < cardCount; k++) {
                        int sum = cards[i] + cards[j] + cards[k];

                        if (sum == targetNumber) {
                            System.out.println(sum);
                            return;
                        }

                        if (sum > result && sum < targetNumber) {
                            result = sum;
                        }
                    }
                }
            }

            System.out.println(result);
        }
    }
}