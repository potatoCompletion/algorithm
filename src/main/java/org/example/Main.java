package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int x = Integer.parseInt(br.readLine());
            int nowCount = 0;
            int prev_count = 1;
            int i = 1;

            while(true) {
                nowCount = prev_count + 1;



                prev_count = nowCount;
            }
        }
    }
}