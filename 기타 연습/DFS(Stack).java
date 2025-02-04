import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//    0
//  1   2
// 3 4   5

class Main {
    static boolean[] visited;
    static List<Integer>[] graph;

    public static void main(String[] args) {
        int n = 6;
        visited = new boolean[n];
        graph = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(1);
        graph[0].add(2);
        graph[1].add(3);
        graph[1].add(4);
        graph[2].add(5);

        System.out.println("DFS 탐색 결과:");
        DFS(0);
    }

    public static void DFS(int start) {
        Stack<Integer> stack = new Stack<>();
        stack.push(start);

        while (!stack.isEmpty()) {
            int node = stack.pop();

            if (!visited[node]) {
                visited[node] = true;
                System.out.print(node + " ");

                for (int neighbor : graph[node]) {
                    if (!visited[neighbor]) {
                        stack.push(neighbor);
                    }
                }
            }
        }
    }
}

