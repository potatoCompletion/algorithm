import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// 백준 14503 로봇 청소기
class Main {
    static int result = 0;
    static boolean finishFlag = false;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 방 입력 정보
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 초기 좌표, 방향 입력 정보
        st = new StringTokenizer(br.readLine(), " ");
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        // 방 그리기
        int[][] room = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < m; j++) {
                room[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 북동남서 지정 (반시계)
        int[] dr = new int[] {-1, 0, 1, 0};
        int[] dc = new int[] {0, 1, 0, -1};

        DFS(room, dr, dc, r, c, d, 0);
        System.out.println(result);
    }

    public static void DFS(int[][] room, int[] dr, int[] dc, int r, int c, int d, int count) {
        if (finishFlag)
            return;

        // 현재 위치가 청소되어 있지 않으면 청소 횟수 + 1, 청소된 상태로 변경(2)
        if (room[r][c] == 0) {
            count++;
            room[r][c] = 2;
        }

        // 북서남동(반시계) 순서로 한 방향씩 체크
        for (int i = 1; i < 5; i ++) {
            int newR = r + dr[(d + i * 3) % 4];
            int newC = c + dc[(d + i * 3) % 4];

            if (room[newR][newC] == 0) {
                DFS(room, dr, dc, newR, newC, (d + i * 3) % 4, count);
            }
        }

        // 바라보는 방향 그대로 후진
        int newR = r + dr[(d + 2) % 4];
        int newC = c + dc[(d + 2) % 4];
        if (room[newR][newC] != 1) {
            DFS(room, dr, dc, newR, newC, d, count);
        }

        if (!finishFlag) {
            result = count;
            finishFlag = true;
        }
    }
}

