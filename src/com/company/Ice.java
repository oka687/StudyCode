package com.company;

import java.util.Random;
import java.util.Scanner;

public class Ice {

    public void firstMoon() {

        // 맵 리스트
        int N = 0;
        int M = 0;

        // 캐릭터 방향
        int x = 1;
        int y = 1;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("N의 개수를 입력");
            N = sc.nextInt();

            System.out.println("M의 개수를 입력");
            M = sc.nextInt();

            if (3 > N || M > 50) {
                System.out.println("다시 입력해주세요.");
            } else {
                break;
            }
        }

        int[][] map = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int k = 0; k < M; k++) {
                // 랜덤으로 육지 또는 바다 결정
                int ran = (int) ((Math.random() * 10000) % 10);

                // 테두리에 해당하는 부분은 전부 바다로 처리
                if (i == 0 || i == N - 1 || k == 0 || k == M - 1) {
                    map[i][k] = 0;
                    System.out.print(map[i][k]);
                } else if (ran <= 5) {
                    // 50% 확률로 육지
                    map[i][k] = 1;
                    System.out.print(map[i][k]);
                } else {
                    // 50% 확률로 바다
                    map[i][k] = 0;
                    System.out.print(map[i][k]);
                }
            }
            System.out.println("");
        }

        // 캐릭터 좌표 계산
        while (true) {
            Random xRan = new Random();
            int dX = xRan.nextInt(N);
            int dY = xRan.nextInt(M);

            if (map[dX][dY] == 0) {
                continue;
            } else {
                x = dX;
                y = dY;
                break;
            }
        }

    }


}
