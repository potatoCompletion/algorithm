package org.example;

import java.awt.print.Pageable;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        String[] participant = new String[0];
        String[] completion = new String[0];

        Map<String, Integer> participantMap = new HashMap<String, Integer>();

        for (String name : participant) {
            participantMap.put(name, participantMap.getOrDefault(name, 0) + 1);
        }

        for (String name : completion) {
            if (!participantMap.containsKey(name)) {

            }
        }

        String answer = "";
        return answer;
    }
}