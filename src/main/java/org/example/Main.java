package org.example;

import java.sql.Array;
import java.util.*;

// 하루에 생산할 수 있는 제품의 수 n
// 각 주문의 납품일과 납품수량을 나타내는 2차원 정수 배열 orders
// 최대한 많은 제품을 납품할 수 있도록 주문 골랐을 때 총 납품수량 return

// 공급 가능한 최초일자를 모두 찾고, 모든 경우의 수를 구해서 가장 큰 값을 리턴
// 75 - 30 = 45
// 45 + 25 = 70
class Main {
    static PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); // max heap

    public static void main(String[] args) {
        int n = 5;
        int[][] orders = new int[][]{
                {10, 60},
                {15, 30},
                {20, 80},
                {30, 40},
                {35, 70},
                {40, 20},
        };
        Stack<Integer> prevIndexStack = new Stack<>();

        DFS(n, orders, 0, 0, 0, 0);
        System.out.println(pq.poll());
    }

    public static void DFS(int n, int[][] orders, int currentIndex, int remain, int sum, int prevPickedDay) {
        for (int i = currentIndex; i < orders.length; i++) {
            int canOrderNum = n * (orders[i][0] - prevPickedDay) + remain;
            int requireOrderNum = orders[i][1];

            if (canOrderNum >= requireOrderNum) {
                DFS(n, orders, i + 1, canOrderNum - requireOrderNum, sum + requireOrderNum, orders[i][0]);
            }
        }

        pq.offer(sum);
    }
}

