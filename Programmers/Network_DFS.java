class Main {
    static int count = 0;

    public static void main(String[] args) {
        int n = 3;
        int[][] computers = new int[][]{
                {1, 1, 0},
                {1, 1, 0},
                {0, 0, 1}
        };

        int answer = 0;
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                DFS(computers, visited, i);
                answer++;
            }
        }
        System.out.println(answer);
    }

    public static void DFS(int[][] computers, boolean[] visited, int row) {
        visited[row] = true;

        for (int j = 0; j < computers.length; j++) {
            if (computers[row][j] == 1 && !visited[j]) {
                DFS(computers, visited, j);
            }
        }

    }
}

