package org.example;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int x = Integer.parseInt(br.readLine());
            int count = 0;

            for (int i = 1; i <= x; i++) {
                for (int j = 1; j <= i; j++) {
                    count++;

                    if (count == x) {
                        if (i % 2 == 0) {
                            System.out.println(j + "/" + (i - j + 1));
                            return;
                        } else {
                            System.out.println((i - j + 1) + "/" + j);
                            return;
                        }
                    }
                }
            }
        }
    }
}