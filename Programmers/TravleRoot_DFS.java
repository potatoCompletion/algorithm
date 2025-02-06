import java.sql.Array;
import java.util.*;

class Main {
    static List<String> result = new ArrayList<>();

    public static void main(String[] args) {
        String[] answer = {};
        String[][] tickets = new String[][] {
                {"ICN", "SFO"},
                {"ICN", "ATL"},
                {"SFO", "ATL"},
                {"ATL", "ICN"},
                {"ATL", "SFO"},
        };
        boolean[] visited = new boolean[tickets.length];

        DFS(tickets, "ICN", "ICN", visited);
        Collections.sort(result);
        System.out.println(result.get(0));
    }

    public static void DFS(String[][] tickets, String start, String word, boolean[] visited) {
        if (word.split(" ").length == tickets.length + 1) {
            result.add(word);
        }

        for (int i = 0; i < tickets.length; i++) {
            if (start.equals(tickets[i][0]) && !visited[i]) {
                visited[i] = true;
                DFS(tickets, tickets[i][1], word + " " + tickets[i][1], visited);
                visited[i] = false;
            }
        }
    }
}

