import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

class Main {
    public static void main(String[] args) {
        int answer = 0;
        int[][] maps = new int[][]{
                {1, 0, 1, 1, 1},
                {1, 0, 1, 0, 1},
                {1, 0, 1, 1, 1},
                {1, 1, 1, 0, 1},
                {0, 0, 0, 0, 1}
        };

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0, 1});    // row, col, count

        int[][] direction = new int[][] {
                {-1, 0},    // 북
                {1, 0},     // 남
                {0, 1},     // 서
                {0, -1}     // 동
        };

        System.out.println(BFS(queue, maps, direction));
    }

    public static int BFS(Queue<int[]> queue, int[][] maps, int[][] direction) {
        while (!queue.isEmpty()) {
            int[] nowInfo = queue.poll();
            int row = nowInfo[0];
            int col = nowInfo[1];
            int count = nowInfo[2];

            if (row == maps.length - 1 && col == maps[0].length - 1) {
                return count;
            }

            for (int[] directionElement : direction) {
                int newRow = row + directionElement[0];
                int newCol = col + directionElement[1];

                if (newRow < 0 || newRow >= maps.length) {
                    continue;
                }

                if (newCol < 0 || newCol >= maps[0].length) {
                    continue;
                }

                if (maps[newRow][newCol] == 0) {
                    continue;
                }

                maps[newRow][newCol] = 0; // 지나온 길 벽으로 표시
                queue.offer(new int[]{newRow, newCol, count + 1});
            }
        }

        return -1;
    }
}

